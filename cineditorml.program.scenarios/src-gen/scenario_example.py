# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

background = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(4)

music = AudioFileClip("./assets/music.mp3")\
	.set_duration(4)\
	.subclip(0, -1)\
	.volumex(0.9)\
	.audio_fadein(2)\
	.audio_fadeout(2)
background = background.set_audio(music)

rec1 = ColorClip(size=(movie_width, movie_width), col=[62,107,197])\
	.set_duration(2)

rec2 = ColorClip(size=(1280, 720), col=[62,197,144])\
	.set_start(2)\
	.set_duration(2)

petitRec = ColorClip(size=(50, 50), col=[255,255,255])\
	.set_duration(4)\
	.set_pos((10, 10))

video = VideoFileClip("./assets/video2.mp4", audio=True)\
	.resize((1280, 720))

title = TextClip("C'est notre film", color='#ffffff', fontsize=70)\
	.set_duration(2)\
	.set_pos(('center', 'bottom'))

bonjour = TextClip("Bonjour ricardo, triagon et sylvano", color='#ff0000', fontsize=50)\
	.set_duration(4)\
	.set_pos((-5, 20))

pic1 = ImageClip("./assets/1.png")\
	.set_duration(4)\
	.set_pos(('center', 'center'))\
	.resize((200, 200))


video = CompositeVideoClip([background, rec1, rec2, petitRec, video, title, bonjour, pic1], size=(movie_width,movie_height)).set_duration(4)
video.write_videofile('./scenario_example.mp4', codec='mpeg4', bitrate='5000k', fps=30)