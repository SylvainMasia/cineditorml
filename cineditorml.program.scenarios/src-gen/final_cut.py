# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 1080
movie_width = 1920

intro = VideoFileClip("./assets/final_cut/prise_0.mp4", audio=True)\
	.resize((1920, 1080))\
	.subclip(4, 59)

prise1 = VideoFileClip("./assets/final_cut/prise_1_crop_40s.mp4", audio=True)\
	.set_start(55)\
	.resize((1920, 1080))

prise2 = VideoFileClip("./assets/final_cut/prise_2_crop_1.15s.mp4", audio=True)\
	.set_start(95)\
	.set_duration(75)\
	.resize((1920, 1080))\
	.subclip(0, 75)

prise3 = VideoFileClip("./assets/final_cut/prise_3_crop_18s.mp4", audio=True)\
	.set_start(170)\
	.set_duration(19)\
	.resize((1920, 1080))\
	.subclip(0, 19)

prise4 = VideoFileClip("./assets/final_cut/prise_4_crop_23s.mp4", audio=True)\
	.set_start(189)\
	.set_duration(24)\
	.resize((1920, 1080))\
	.subclip(0, 24)

intro = intro.crossfadeout(1)

prise1 = prise1.crossfadeout(1)

prise2 = prise2.crossfadeout(1)

prise3 = prise3.crossfadeout(1)

prise4 = prise4.crossfadeout(1)


final_video = CompositeVideoClip([intro, prise1, prise2, prise3, prise4], size=(movie_width,movie_height)).set_duration(213)
final_video.write_videofile('./final_cut.mp4', codec='mpeg4', bitrate='5000k', fps=30)