# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

audio_fake = ColorClip(size=(0, 0), col=[0,0,0])\
	.set_duration(37)

sound = AudioFileClip("./assets/scenario1/wind.mp3")\
	.set_start(13)\
	.set_duration(10)\
	.subclip(3, 13)\
	.audio_fadeout(2)
audio_fake = audio_fake.set_audio(sound)

background = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(10)

title = TextClip("Nos vacances a la montagne", color='#fff', fontsize=50)\
	.set_duration(10)\
	.set_pos(('center', 'center'))

intro = VideoFileClip("./assets/scenario1/intro.mp4", audio=True)\
	.set_start(10)\
	.resize((1280, 720))

second = VideoFileClip("./assets/scenario1/montagne.mp4", audio=True)\
	.set_start(13)\
	.set_duration(10)\
	.resize((1280, 720))

bye = TextClip("Merci d'avoir regardé notre vidéo", color='#0000ff', fontsize=50)\
	.set_start(22)\
	.set_duration(15)\
	.set_pos(('center', 'center'))


video = CompositeVideoClip([audio_fake, background, title, intro, second, bye], size=(movie_width,movie_height)).set_duration(37)
video.write_videofile('./bob_and_alice_holiday.mp4', codec='mpeg4', bitrate='5000k', fps=30)