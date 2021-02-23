# CinEditorML

CinEditorML, the most powerful video editor on earth. [TP HERE](https://www.i3s.unice.fr/~deantoni/teaching_resources/SI5/DSL/current/TDs/lab2/dsl_lab2.pdf)

# Team

CinEditorMl, a powerful video editor language developed by :
- Masia Sylvain
- Montoya Damien
- Peres Richard
- Rigaut François
also known as "Spaceteam"

# Architecture
- CinEditorML : contient la syntaxe abstraite (.ecore)
- polytech.spaceteam.cineditor : contient la syntaxe concrete (.xtext)
- extension des fichiers : .space

# Installation
- In order to launch moviepy with every dependencies :
  - `docker pull dkarchmervue/moviepy`
  - `docker run --rm -ti -v C:\dev\courses\cineditorml\cineditorml.program.scenarios\src-gen:/work dkarchmervue/moviepy /bin/bash`
    - `python yourscript.py`

# Warning
When using Audio with moviepy, the audio must not have a cover (such as .mp3 can have a picture) because it will crash. An issue has been open to fix that (https://github.com/Zulko/moviepy/issues/448) but it seems that it has not been fixed.
