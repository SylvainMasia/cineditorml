# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

background = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(10)

title = TextClip("Le setup d'alice pour le télétravail", color='#e3e3e3', fontsize=35)\
	.set_duration(10)\
	.set_pos(('center', 'center'))

clip1a = VideoFileClip("./assets/scenario2/alice_cast.mp4", audio=True)\
	.set_start(10)\
	.resize((1280, 720))\
	.subclip(23, 107)

s1 = TextClip("L'ordinateur pour travailler", color='#fff', fontsize=35)\
	.set_start(10)\
	.set_duration(10)\
	.set_pos(('center', 'bottom'))

s2 = TextClip("Mes super pops", color='#fff', fontsize=25)\
	.set_start(50)\
	.set_duration(10)\
	.set_pos(('center', 'bottom'))

clip1b = VideoFileClip("./assets/scenario2/alice_cast.mp4", audio=True)\
	.set_start(94)\
	.resize((1280, 720))\
	.subclip(121, 141)

s3 = TextClip("Video sur les mathematiques", color='#e3e3e3', fontsize=35)\
	.set_start(99)\
	.set_duration(15)\
	.set_pos(('center', 'bottom'))

bye = TextClip("C'était le setup d'Alice", color='#0000ff', fontsize=50)\
	.set_start(114)\
	.set_duration(15)\
	.set_pos(('center', 'center'))


final_video = CompositeVideoClip([background, title, clip1a, s1, s2, clip1b, s3, bye], size=(movie_width,movie_height)).set_duration(129)
final_video.write_videofile('./alice_cast.mp4', codec='mpeg4', bitrate='5000k', fps=30)