# -*- coding: ISO-8859-1 -*-

from moviepy.editor import *

movie_height = 720
movie_width = 1280

text = TextClip("Introduction", color='#fff', fontsize=35)\
	.set_duration(7)\
	.set_pos(('center', 'center'))

voix = AudioFileClip("./assets/scenario_stacking/voix.mp3")\
	.set_duration(44)
voix_fake_audio_attached = ColorClip(size=(0, 0), col=[0,0,0]).set_audio(voix)

backgroundvideo = VideoFileClip("./assets/scenario_stacking/rugby.mp4", audio=False)\
	.set_start(7)\
	.resize((1280, 720))

backgroundvideo2 = VideoFileClip("./assets/scenario_stacking/rugby.mp4", audio=False)\
	.set_start(17)\
	.resize((1280, 720))\
	.subclip(20, 30)

backgroundvideo3 = VideoFileClip("./assets/scenario_stacking/rugby.mp4", audio=False)\
	.set_start(27)\
	.resize((1280, 720))\
	.subclip(133, 143)

backgroundvideo = backgroundvideo.crossfadeout(1)

backgroundvideo2 = backgroundvideo2.crossfadeout(1)

backgroundvideo = backgroundvideo.crossfadein(1)

backgroundvideo2 = backgroundvideo2.crossfadein(1)

backgroundvideo3 = backgroundvideo3.crossfadein(1)

bobvideo = VideoFileClip("./assets/scenario_stacking/bob.mp4", audio=False)\
	.resize((355, 200))\
	.set_pos(('right', 'bottom'))\
	.margin(bottom=10, color=[0,0,0], opacity=0.0)\
	.margin(right=10, color=[0,0,0], opacity=0.0)\
	.subclip(12, 56)


final_video = CompositeVideoClip([text, voix_fake_audio_attached, backgroundvideo, backgroundvideo2, backgroundvideo3, bobvideo], size=(movie_width,movie_height)).set_duration(44)
final_video.write_videofile('./scenario_stacking_transitions.mp4', codec='mpeg4', bitrate='5000k', fps=30)