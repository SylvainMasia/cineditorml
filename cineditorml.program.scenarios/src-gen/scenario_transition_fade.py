# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

background = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(8)

music = AudioFileClip("./assets/music.mp3")\
	.set_duration(8)\
	.volumex(0.5)\
	.audio_fadein(1)\
	.audio_fadeout(1)
background = background.set_audio(music)

rec1 = ColorClip(size=(movie_width, movie_width), col=[0,15,255])\
	.set_duration(2)

rec2 = ColorClip(size=(1280, 720), col=[186,32,38])\
	.set_start(2)\
	.set_duration(2)

rec3 = ColorClip(size=(1280, 720), col=[255,237,0])\
	.set_start(4)\
	.set_duration(2)

rec4 = ColorClip(size=(1280, 720), col=[0,173,94])\
	.set_start(6)\
	.set_duration(2)

rec1 = rec1.crossfadeout(1)

rec2 = rec2.crossfadeout(1)

rec3 = rec3.crossfadeout(1)

rec2 = rec2.crossfadein(1)

rec3 = rec3.crossfadein(1)

rec4 = rec4.crossfadein(1)


video = CompositeVideoClip([background, rec1, rec2, rec3, rec4], size=(movie_width,movie_height)).set_duration(8)
video.write_videofile('./scenario_transition_fade.mp4', codec='mpeg4', bitrate='5000k', fps=30)