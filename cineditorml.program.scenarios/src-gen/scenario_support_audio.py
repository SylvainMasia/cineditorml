# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

background1 = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(10)

background2 = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(10)

background3 = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(24)

voix = AudioFileClip("./assets/scenario_audio/voix1.mp3")\
	.set_duration(10)
background1 = background1.set_audio(voix)

voix2 = AudioFileClip("./assets/scenario_audio/voix2.mp3")\
	.set_start(10)\
	.set_duration(45)\
	.volumex(0.5)
background2 = background2.set_audio(voix2)

voix3 = AudioFileClip("./assets/scenario_audio/voix3.mp3")\
	.set_start(20)\
	.set_duration(45)\
	.audio_fadein(1)\
	.audio_fadeout(1)
background3 = background3.set_audio(voix3)

backgroundvideo = VideoFileClip("./assets/scenario_audio/video.mp4", audio=False)\
	.resize((1280, 720))


video = CompositeVideoClip([background1, background2, background3, backgroundvideo], size=(movie_width,movie_height)).set_duration(45)
video.write_videofile('./scenario_support_audio.mp4', codec='mpeg4', bitrate='5000k', fps=30)