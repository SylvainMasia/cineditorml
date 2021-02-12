/**
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.generator;

import CinEditorML.AudioElement;
import CinEditorML.Dimension;
import CinEditorML.Effect;
import CinEditorML.Element;
import CinEditorML.FadeIn;
import CinEditorML.FadeOut;
import CinEditorML.GraphicalElement;
import CinEditorML.HexadecimalColor;
import CinEditorML.ItemPosition;
import CinEditorML.ItemPositionInt;
import CinEditorML.ItemPositionString;
import CinEditorML.Layer;
import CinEditorML.Movie;
import CinEditorML.Picture;
import CinEditorML.Position;
import CinEditorML.Rectangle;
import CinEditorML.Shape;
import CinEditorML.Text;
import CinEditorML.Translate;
import CinEditorML.Video;
import com.google.common.collect.Iterables;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CinEditorGenerator extends AbstractGenerator {
  private final String varMovieHeight = "movie_height";
  
  private final String varMovieWidth = "movie_width";
  
  private final ArrayList<Object> elementsVarNames = new ArrayList<Object>();
  
  private final int totalMovieDuration = 10;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.elementsVarNames.clear();
    Iterable<Movie> _filter = Iterables.<Movie>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Movie.class);
    for (final Movie movie : _filter) {
      {
        final QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(movie);
        String _plus = (_fullyQualifiedName + ".py");
        fsa.generateFile(_plus, 
          this.compile(movie));
      }
    }
  }
  
  private String compile(final Movie movie) {
    String movieString = this.loadImports();
    String _movieString = movieString;
    String _extractMovieSize = this.extractMovieSize(movie);
    movieString = (_movieString + _extractMovieSize);
    String _movieString_1 = movieString;
    String _extractLayers = this.extractLayers(movie.getLayers());
    movieString = (_movieString_1 + _extractLayers);
    String _movieString_2 = movieString;
    String _extractFinalCut = this.extractFinalCut(movie);
    movieString = (_movieString_2 + _extractFinalCut);
    return movieString;
  }
  
  private String extractFinalCut(final Movie movie) {
    String sFinal = "\nvideo = CompositeVideoClip([";
    for (int i = 0; (i < this.elementsVarNames.size()); i++) {
      {
        if ((i != 0)) {
          String _sFinal = sFinal;
          sFinal = (_sFinal + ", ");
        }
        String _sFinal_1 = sFinal;
        Object _get = this.elementsVarNames.get(i);
        sFinal = (_sFinal_1 + _get);
      }
    }
    String _sFinal = sFinal;
    sFinal = (_sFinal + (((("], size=(" + this.varMovieWidth) + ",") + this.varMovieHeight) + ")).set_duration(10)\n"));
    String _sFinal_1 = sFinal;
    String _name = movie.getName();
    String _plus = ("video.write_videofile(\'./" + _name);
    String _plus_1 = (_plus + ".mp4\', codec=\'mpeg4\', fps=");
    int _fps = movie.getFps();
    String _plus_2 = (_plus_1 + Integer.valueOf(_fps));
    String _plus_3 = (_plus_2 + ")");
    sFinal = (_sFinal_1 + _plus_3);
    return sFinal;
  }
  
  private String extractLayers(final List<Layer> layers) {
    String s = "";
    for (final Layer layer : layers) {
      String _s = s;
      String _extractElementsFromLayer = this.extractElementsFromLayer(layer.getElements());
      s = (_s + _extractElementsFromLayer);
    }
    return s;
  }
  
  private String extractElementInLayer(final Element element) {
    String s = "";
    if ((element instanceof Text)) {
      String _s = s;
      String _extractElement = this.extractElement(((Text) element));
      s = (_s + _extractElement);
    } else {
      if ((element instanceof Picture)) {
        String _s_1 = s;
        String _extractElement_1 = this.extractElement(((Picture) element));
        s = (_s_1 + _extractElement_1);
      } else {
        if ((element instanceof Video)) {
          String _s_2 = s;
          String _extractElement_2 = this.extractElement(((Video) element));
          s = (_s_2 + _extractElement_2);
        } else {
          if ((element instanceof Effect)) {
            String _s_3 = s;
            String _extractElement_3 = this.extractElement(((Effect) element));
            s = (_s_3 + _extractElement_3);
          } else {
            if ((element instanceof Shape)) {
              String _s_4 = s;
              String _extractElement_4 = this.extractElement(((Shape) element));
              s = (_s_4 + _extractElement_4);
            } else {
              if ((element instanceof AudioElement)) {
                String _s_5 = s;
                String _extractElement_5 = this.extractElement(((AudioElement) element));
                s = (_s_5 + _extractElement_5);
              }
            }
          }
        }
      }
    }
    return s;
  }
  
  private String extractBeginTimeFromElement(final Element element) {
    String s = "";
    int _beginTime = element.getBeginTime();
    boolean _greaterThan = (_beginTime > 0);
    if (_greaterThan) {
      String _s = s;
      int _beginTime_1 = element.getBeginTime();
      String _plus = ("\\\n\t.set_start(" + Integer.valueOf(_beginTime_1));
      String _plus_1 = (_plus + ")");
      s = (_s + _plus_1);
    }
    return s;
  }
  
  private String extractDurationFromElement(final Element element) {
    String s = "";
    int duration = (-1);
    int _duration = element.getDuration();
    boolean _greaterThan = (_duration > 0);
    if (_greaterThan) {
      duration = element.getDuration();
    } else {
      if ((element instanceof AudioElement)) {
        duration = ((AudioElement) element).getElement().getDuration();
        if ((duration < 0)) {
          duration = this.totalMovieDuration;
        }
      } else {
        if ((!(element instanceof Video))) {
          duration = this.totalMovieDuration;
        }
      }
    }
    if ((duration != (-1))) {
      String _s = s;
      s = (_s + (("\\\n\t.set_duration(" + Integer.valueOf(duration)) + ")"));
    }
    return s;
  }
  
  private String extractDimensionFromElement(final GraphicalElement element) {
    String s = "";
    Dimension _dimension = element.getDimension();
    boolean _tripleNotEquals = (_dimension != null);
    if (_tripleNotEquals) {
      String width = "0";
      String height = "0";
      int _width = element.getDimension().getWidth();
      boolean _lessThan = (_width < 0);
      if (_lessThan) {
        width = this.varMovieWidth;
      } else {
        int _width_1 = element.getDimension().getWidth();
        String _plus = (Integer.valueOf(_width_1) + "");
        width = _plus;
      }
      int _height = element.getDimension().getHeight();
      boolean _lessThan_1 = (_height < 0);
      if (_lessThan_1) {
        height = this.varMovieWidth;
      } else {
        int _height_1 = element.getDimension().getHeight();
        String _plus_1 = (Integer.valueOf(_height_1) + "");
        height = _plus_1;
      }
      if ((element instanceof Shape)) {
        String _s = s;
        s = (_s + (((("(" + width) + ", ") + height) + ")"));
      } else {
        String _s_1 = s;
        s = (_s_1 + (((("\\\n\t.resize((" + width) + ", ") + height) + "))"));
      }
    }
    return s;
  }
  
  private String extractPositionFromElement(final GraphicalElement element) {
    String s = "";
    String posX = "";
    String posY = "";
    Position _position = element.getPosition();
    boolean _tripleNotEquals = (_position != null);
    if (_tripleNotEquals) {
      posX = this.extractValueFromItemPosition(element.getPosition().getX());
      posY = this.extractValueFromItemPosition(element.getPosition().getY());
    } else {
      posX = "0";
      posY = "0";
    }
    if (((!posX.equals("0")) || (!posY.equals("0")))) {
      String _s = s;
      s = (_s + (((("\\\n\t.set_pos((" + posX) + ", ") + posY) + "))"));
    }
    return s;
  }
  
  private String extractValueFromItemPosition(final ItemPosition item) {
    if ((item instanceof ItemPositionInt)) {
      int _position = ((ItemPositionInt) item).getPosition();
      return (Integer.valueOf(_position) + "");
    }
    String _position_1 = ((ItemPositionString) item).getPosition();
    String _plus = ("\'" + _position_1);
    return (_plus + "\'");
  }
  
  private String extractElement(final Text element) {
    String _name = element.getName();
    String _plus = (_name + " = TextClip(");
    String _plus_1 = (_plus + "\"");
    String _text = element.getText();
    String _plus_2 = (_plus_1 + _text);
    String _plus_3 = (_plus_2 + "\"");
    String _plus_4 = (_plus_3 + ", color=\'#");
    String _hexadecimalValue = element.getColor().getHexadecimalValue();
    String _plus_5 = (_plus_4 + _hexadecimalValue);
    String _plus_6 = (_plus_5 + "\'");
    String _plus_7 = (_plus_6 + ", fontsize=");
    int _fontSize = element.getFontSize();
    String _plus_8 = (_plus_7 + Integer.valueOf(_fontSize));
    String _plus_9 = (_plus_8 + ")");
    String _extractBeginTimeFromElement = this.extractBeginTimeFromElement(element);
    String _plus_10 = (_plus_9 + _extractBeginTimeFromElement);
    String _extractDurationFromElement = this.extractDurationFromElement(element);
    String _plus_11 = (_plus_10 + _extractDurationFromElement);
    String _extractPositionFromElement = this.extractPositionFromElement(element);
    String _plus_12 = (_plus_11 + _extractPositionFromElement);
    String s = (_plus_12 + "\n\n");
    this.elementsVarNames.add(element.getName());
    return s;
  }
  
  private String extractElement(final Picture element) {
    String _name = element.getName();
    String _plus = (_name + " = ImageClip(");
    String _plus_1 = (_plus + "\"");
    String _url = element.getUrl();
    String _plus_2 = (_plus_1 + _url);
    String _plus_3 = (_plus_2 + "\"");
    String _plus_4 = (_plus_3 + ")");
    String _extractBeginTimeFromElement = this.extractBeginTimeFromElement(element);
    String _plus_5 = (_plus_4 + _extractBeginTimeFromElement);
    String _extractDurationFromElement = this.extractDurationFromElement(element);
    String _plus_6 = (_plus_5 + _extractDurationFromElement);
    String _extractPositionFromElement = this.extractPositionFromElement(element);
    String _plus_7 = (_plus_6 + _extractPositionFromElement);
    String _extractDimensionFromElement = this.extractDimensionFromElement(element);
    String _plus_8 = (_plus_7 + _extractDimensionFromElement);
    String s = (_plus_8 + "\n\n");
    this.elementsVarNames.add(element.getName());
    return s;
  }
  
  private String extractElement(final AudioElement element) {
    String volume = "";
    String fadeIn = "";
    String fadeOut = "";
    float _volume = element.getVolume();
    boolean _notEquals = (_volume != 1);
    if (_notEquals) {
      float _volume_1 = element.getVolume();
      String _plus = ("\\\n\t.volumex(" + Float.valueOf(_volume_1));
      String _plus_1 = (_plus + ")");
      volume = _plus_1;
    }
    int _fadeIn = element.getFadeIn();
    boolean _notEquals_1 = (_fadeIn != 0);
    if (_notEquals_1) {
      int _fadeIn_1 = element.getFadeIn();
      String _plus_2 = ("\\\n\t.audio_fadein(" + Integer.valueOf(_fadeIn_1));
      String _plus_3 = (_plus_2 + ")");
      fadeIn = _plus_3;
    }
    int _fadeOut = element.getFadeOut();
    boolean _notEquals_2 = (_fadeOut != 0);
    if (_notEquals_2) {
      int _fadeOut_1 = element.getFadeOut();
      String _plus_4 = ("\\\n\t.audio_fadeout(" + Integer.valueOf(_fadeOut_1));
      String _plus_5 = (_plus_4 + ")");
      fadeOut = _plus_5;
    }
    String _name = element.getName();
    String _plus_6 = (_name + " = AudioFileClip(");
    String _plus_7 = (_plus_6 + "\"");
    String _url = element.getUrl();
    String _plus_8 = (_plus_7 + _url);
    String _plus_9 = (_plus_8 + "\"");
    String _plus_10 = (_plus_9 + ")");
    String _extractBeginTimeFromElement = this.extractBeginTimeFromElement(element);
    String _plus_11 = (_plus_10 + _extractBeginTimeFromElement);
    String _extractDurationFromElement = this.extractDurationFromElement(element);
    String _plus_12 = (_plus_11 + _extractDurationFromElement);
    String _plus_13 = (_plus_12 + volume);
    String _plus_14 = (_plus_13 + fadeIn);
    String _plus_15 = (_plus_14 + fadeOut);
    String s = (_plus_15 + "\n");
    String _s = s;
    String _name_1 = element.getElement().getName();
    String _plus_16 = (_name_1 + " = ");
    String _name_2 = element.getElement().getName();
    String _plus_17 = (_plus_16 + _name_2);
    String _plus_18 = (_plus_17 + ".set_audio(");
    String _name_3 = element.getName();
    String _plus_19 = (_plus_18 + _name_3);
    String _plus_20 = (_plus_19 + ")\n\n");
    s = (_s + _plus_20);
    return s;
  }
  
  private String extractElement(final Video element) {
    String cropString = "";
    int _beginCropTime = element.getBeginCropTime();
    boolean _greaterThan = (_beginCropTime > (-1));
    if (_greaterThan) {
      int _beginCropTime_1 = element.getBeginCropTime();
      String _plus = ("\\\n\t.subclip(" + Integer.valueOf(_beginCropTime_1));
      String _plus_1 = (_plus + ", ");
      int _beginCropTime_2 = element.getBeginCropTime();
      int _duration = element.getDuration();
      int _plus_2 = (_beginCropTime_2 + _duration);
      String _plus_3 = (_plus_1 + Integer.valueOf(_plus_2));
      String _plus_4 = (_plus_3 + ")");
      cropString = _plus_4;
    }
    String audio = "";
    boolean _equals = Boolean.valueOf(element.isEnableAudio()).equals("true");
    if (_equals) {
      audio = "True";
    } else {
      audio = "False";
    }
    String _name = element.getName();
    String _plus_5 = (_name + " = VideoFileClip(");
    String _plus_6 = (_plus_5 + "\"");
    String _url = element.getUrl();
    String _plus_7 = (_plus_6 + _url);
    String _plus_8 = (_plus_7 + "\"");
    String _plus_9 = (_plus_8 + ", audio=");
    String _plus_10 = (_plus_9 + audio);
    String _plus_11 = (_plus_10 + ")");
    String _extractBeginTimeFromElement = this.extractBeginTimeFromElement(element);
    String _plus_12 = (_plus_11 + _extractBeginTimeFromElement);
    String _extractDurationFromElement = this.extractDurationFromElement(element);
    String _plus_13 = (_plus_12 + _extractDurationFromElement);
    String _extractDimensionFromElement = this.extractDimensionFromElement(element);
    String _plus_14 = (_plus_13 + _extractDimensionFromElement);
    String _plus_15 = (_plus_14 + cropString);
    String s = (_plus_15 + "\n\n");
    this.elementsVarNames.add(element.getName());
    return s;
  }
  
  private String extractElement(final FadeIn element) {
    String s = "";
    return s;
  }
  
  private String extractElement(final FadeOut element) {
    String s = "";
    return s;
  }
  
  private String extractElement(final Translate element) {
    String s = "";
    return s;
  }
  
  private String extractElement(final Rectangle element) {
    String color = "[0,0,0]";
    HexadecimalColor _color = element.getColor();
    boolean _tripleNotEquals = (_color != null);
    if (_tripleNotEquals) {
      String _hexadecimalValue = element.getColor().getHexadecimalValue();
      String _plus = ("#" + _hexadecimalValue);
      final Color tmp = Color.decode(_plus);
      int _red = tmp.getRed();
      String _plus_1 = ("[" + Integer.valueOf(_red));
      String _plus_2 = (_plus_1 + ",");
      int _green = tmp.getGreen();
      String _plus_3 = (_plus_2 + Integer.valueOf(_green));
      String _plus_4 = (_plus_3 + ",");
      int _blue = tmp.getBlue();
      String _plus_5 = (_plus_4 + Integer.valueOf(_blue));
      String _plus_6 = (_plus_5 + "]");
      color = _plus_6;
    }
    String _name = element.getName();
    String _plus_7 = (_name + " = ColorClip(size=");
    String _extractDimensionFromElement = this.extractDimensionFromElement(element);
    String _plus_8 = (_plus_7 + _extractDimensionFromElement);
    String _plus_9 = (_plus_8 + ", col=");
    String _plus_10 = (_plus_9 + color);
    String _plus_11 = (_plus_10 + ")");
    String _extractBeginTimeFromElement = this.extractBeginTimeFromElement(element);
    String _plus_12 = (_plus_11 + _extractBeginTimeFromElement);
    String _extractDurationFromElement = this.extractDurationFromElement(element);
    String _plus_13 = (_plus_12 + _extractDurationFromElement);
    String _extractPositionFromElement = this.extractPositionFromElement(element);
    String _plus_14 = (_plus_13 + _extractPositionFromElement);
    String s = (_plus_14 + "\n\n");
    this.elementsVarNames.add(element.getName());
    return s;
  }
  
  private String extractElement(final Effect element) {
    String s = "";
    if ((element instanceof FadeIn)) {
      String _s = s;
      String _extractElement = this.extractElement(((FadeIn) element));
      s = (_s + _extractElement);
    } else {
      if ((element instanceof FadeOut)) {
        String _s_1 = s;
        String _extractElement_1 = this.extractElement(((FadeOut) element));
        s = (_s_1 + _extractElement_1);
      } else {
        if ((element instanceof Translate)) {
          String _s_2 = s;
          String _extractElement_2 = this.extractElement(((Translate) element));
          s = (_s_2 + _extractElement_2);
        }
      }
    }
    return s;
  }
  
  private String extractElement(final Shape element) {
    String s = "";
    if ((element instanceof Rectangle)) {
      String _s = s;
      String _extractElement = this.extractElement(((Rectangle) element));
      s = (_s + _extractElement);
    }
    return s;
  }
  
  private String extractElementsFromLayer(final List<Element> elements) {
    String s = "";
    for (final Element element : elements) {
      String _s = s;
      String _extractElementInLayer = this.extractElementInLayer(element);
      s = (_s + _extractElementInLayer);
    }
    return s;
  }
  
  private String extractMovieSize(final Movie movie) {
    int _height = movie.getDimension().getHeight();
    String _plus = ((this.varMovieHeight + " = ") + Integer.valueOf(_height));
    String s = (_plus + "\n");
    String _s = s;
    int _width = movie.getDimension().getWidth();
    String _plus_1 = ((this.varMovieWidth + " = ") + Integer.valueOf(_width));
    String _plus_2 = (_plus_1 + "\n");
    s = (_s + _plus_2);
    String _s_1 = s;
    s = (_s_1 + "\n");
    return s;
  }
  
  private String loadImports() {
    String s = "from moviepy.editor import *\n";
    String _s = s;
    s = (_s + "\n");
    return s;
  }
}
