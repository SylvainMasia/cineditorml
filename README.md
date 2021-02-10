# CinEditorML

CinEditorML, the most powerful video editor on earth

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
    - `python file.py`