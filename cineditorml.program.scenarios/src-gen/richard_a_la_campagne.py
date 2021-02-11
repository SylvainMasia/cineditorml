from moviepy.editor import *

movie_height = 720
movie_width = 1280

pic1 = ImageClip("./assets/1.png")\
	.set_duration(20)\
	.set_pos(('center', 'center'))
title = TextClip("C'est notre film", color='#ffffff', fontsize=70)\
	.set_duration(20)\
	.set_pos(('center', 'center'))
bonjour = TextClip("Bonjour", color='#e3e3e3', fontsize=50)\
	.set_pos((-5, 20))

video = CompositeVideoClip([pic1, title, bonjour, pic1, title, bonjour], size=(movie_width,movie_height)).set_duration(15)
video.write_videofile('./richard_a_la_campagne.avi', codec='mpeg4', fps=30)