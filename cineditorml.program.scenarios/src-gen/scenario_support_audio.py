# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

voix = AudioFileClip("./assets/scenario_audio/voix1.mp3")\
	.set_duration(10)
voix_fake_audio_attached = ColorClip(size=(0, 0), col=[0,0,0]).set_audio(voix)

voix2 = AudioFileClip("./assets/scenario_audio/voix2.mp3")\
	.set_start(10)\
	.set_duration(10)\
	.volumex(0.5)
voix2_fake_audio_attached = ColorClip(size=(0, 0), col=[0,0,0]).set_audio(voix2)

voix3 = AudioFileClip("./assets/scenario_audio/voix3.mp3")\
	.set_start(20)\
	.set_duration(24)\
	.audio_fadein(1)\
	.audio_fadeout(1)
voix3_fake_audio_attached = ColorClip(size=(0, 0), col=[0,0,0]).set_audio(voix3)

backgroundvideo = VideoFileClip("./assets/scenario_audio/video.mp4", audio=False)\
	.resize((1280, 720))


final_video = CompositeVideoClip([voix_fake_audio_attached, voix2_fake_audio_attached, voix3_fake_audio_attached, backgroundvideo], size=(movie_width,movie_height)).set_duration(45)
final_video.write_videofile('./scenario_support_audio.mp4', codec='mpeg4', bitrate='5000k', fps=30)