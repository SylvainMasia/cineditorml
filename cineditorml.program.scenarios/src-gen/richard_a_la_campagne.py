from moviepy.editor import *

movie_height = 720
movie_width = 1280

background = ColorClip(size=(movie_width, movie_width), col=[0,0,0])\
	.set_duration(10)

audio = AudioFileClip("./assets/music.mp3")\
	.set_duration(10)\
	.volumex(0.9)\
	.audio_fadein(2)\
	.audio_fadeout(2)
background = background.set_audio(audio)

rec1 = ColorClip(size=(movie_width, movie_width), col=[62,107,197])\
	.set_duration(2)

rec2 = ColorClip(size=(1280, 720), col=[62,197,144])\
	.set_start(2)\
	.set_duration(2)

rec3 = ColorClip(size=(50, 50), col=[255,255,255])\
	.set_duration(4)\
	.set_pos((10, 10))

title = TextClip("C'est notre film", color='#ffffff', fontsize=70)\
	.set_duration(2)\
	.set_pos(('center', 'bottom'))

bonjour = TextClip("Bonjour ricardo, triagon et sylvano", color='#ff0000', fontsize=50)\
	.set_duration(10)\
	.set_pos((-5, 20))

pic1 = ImageClip("./assets/1.png")\
	.set_duration(4)\
	.set_pos(('center', 'center'))\
	.resize((200, 200))


video = CompositeVideoClip([background, rec1, rec2, rec3, title, bonjour, pic1, background, rec1, rec2, rec3, title, bonjour, pic1], size=(movie_width,movie_height)).set_duration(10)
video.write_videofile('./richard_a_la_campagne.avi', codec='mpeg4', fps=30)