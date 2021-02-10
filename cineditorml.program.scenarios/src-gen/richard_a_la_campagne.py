from moviepy.editor import *

movie_height = 720
movie_width = 1280

title = TextClip("C'est notre film", color='#ffffff', fontsize=70)\
	.set_duration(20)\
	.set_pos((350, 150))
bonjour = TextClip("Bonjour", color='#e3e3e3', fontsize=50)\
	.set_pos(('right', 20))\
	.margin(bottom=0, right=1)

video = CompositeVideoClip([title, bonjour], size=(movie_width,movie_height)).set_duration(15)
video.write_videofile('./richard_a_la_campagne.avi', codec='mpeg4', fps=60)