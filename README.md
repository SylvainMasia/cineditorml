# CinEditorML

CinEditorML, the most powerful video editor on earth. [TP HERE](https://www.i3s.unice.fr/~deantoni/teaching_resources/SI5/DSL/current/TDs/lab2/dsl_lab2.pdf)

# Team

CinEditorMl, a powerful video editor language developed by :
- Masia Sylvain
- Montoya Damien
- Perez Richard
- Rigaut François
also known as "Spaceteam"

# Architecture
- CinEditorML : contient la syntaxe abstraite (.ecore)
- polytech.spaceteam.cineditor : contient la syntaxe concrete (.xtext)
- extension des fichiers : .space

# Installation
- In order to launch moviepy with every dependencies :
  - `docker pull dkarchmervue/moviepy`
  - `docker run --rm -ti -v C:\dev\courses\cineditorml\cineditorml.program.scenarios\src-gen:/work dkarchmervue/moviepy /bin/bash`
    - `python yourscript.py`

# Warning
When using Audio with moviepy, the audio must not have a cover (such as .mp3 can have a picture) because it will crash. An issue has been open to fix that (https://github.com/Zulko/moviepy/issues/448) but it seems that it has not been fixed.

# BNF Syntax

```<int>       :=  ("-")? [0-9]+
<float>     :=  [0-9]+ (("." | ",") <int>+)?
<bool>      :=  "true" | "false"

<name>      :=  [A-Za-z_] [A-Za-z_0-9]*
<dimension> :=  "dimension" <int> "x" <int>
<fps>       :=  "fps" <int>
<duration>  :=  "during" <int>
<hex_color> :=  "color" "'" [a-f0-9](6) "'"
<opacity>   :=  "opacity" <float>
<crop>      :=  "cropAt" <int>
<shape_name>    :=  "Rectangle"

<url_path>  :=  (<name> | ".") ("/" <name>)*
<video_url> :=  <url_path> "." ("mp4" | "avi")
<audio_url> :=  <url_path> "." ("wav" | "flac" | "mp3")
<image_url> :=  <url_path> "." ("jpg" | "jpeg" | "png")

<position_x>    :=  <int> | "left" | "center" | "right"
<position_y>    :=  <int> | "top" | "center" | "bottom"
<position>      :=  "position" "(" <position_x> "," <position_y> ")"

<temporal_position> :=  ("startAt" <int>) | ("startAfter" <name>) | ("startAt" <int> "startAfter" <name>)

<margin_name>   :=  "bottom" | "left" | "top" | "right"
<margin>        :=  <margin_name> "(" <int> <hex_color>? <opacity>? ")"
<margins>       :=  "margins(" <margin>+ ")"



<shape>     :=  <shape_name> <name> "=" <hex_color> <position>? <dimension>? <margins>? <temporal_position>? <duration>?
<text>      :=  "Text" <name> "=" .+ ("fontSize" <int>)? <position>? <margins>? <temporal_position>? <duration>?
<picture>   :=  "Picture" <name> "=" <position>? <dimension>? <margins>? <temporal_position>? <duration>?
<video>     :=  "Video" <name> "=" <video_url> ("audio" <boolean>)? <position>? <dimension>? <margins>? <temporal_position>? <crop>? <duration>

<graphical_element> :=  (<video> | <picture> | <text> | <shape>)

<audio_element> :=  "Audio" <name> "=" <audio_url> ("volume" <float>)? ("fadeIn" <int>)? ("fadeOut" <int>)? <temporal_position>? <crop>? <duration>

<fade>              :=  ("FadeIn" | "FadeOut") <duration> 
<translate>         :=  "Translate" <position> <temporal_position>? <duration>?
<effect>            :=  <fade> | <translate>
<effect_element>    :=  "Effect" <name> "=" <effect> "on" "[" <name> ("," <name>)* "]"

<layer_element>     :=  (<graphical_element> | <audio_element> | <effect_element>)
<layer_elements>    :=  <layer_element>+
<layer>             :=  "Layer" <layer_elements>
<layers>            :=  <layer>+

<movie> :=  "Movie" <name> <dimension> <fps>

<program>   :=  <movie> <layers>
```