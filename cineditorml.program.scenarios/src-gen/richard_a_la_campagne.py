from moviepy.editor import *

movie_height = 1080
movie_width = 1920

title = TextClip("C'est notre film", color='#ffffff', fontsize=20)\
	.set_duration(20)
bonjour = TextClip("Bonjour", color='#e3e3e3', fontsize=20)

video = CompositeVideoClip([title, bonjour])