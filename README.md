# Picture classificatior

Simple Java 17 project to decide whether an image from a dataset can be acceptable for the project's interest or not
Done very quickly, thanks also to the OOP project delivered a few months earlier
It is therefore not very elegant, but it has proven to be particularly useful for quickly merging multiple datasets and thus reaching a total of 2400 images

A few images have been left to provide a quick demonstration of how it works

Use Gradle to run the program, either with the support of VSCode or with the command:
> gradle run

Before the command, upload your photo in ./resources/TOSELECT and relative labels in ./resources/LABS
Press 'S', and you are ready to classify your pictures!

## Just a few comands
S -> go to next photo
A -> go to previous photo
0-9 -> give a score of quality of the photo. This allow you to pic only the best one

C -> when you have classify enough picture, this command close the program and next classify all photo in well-suited directory. You will able to find the results in ./resources/CLASSIFIED

any other key of keyboard -> undo any classification of a picture

BONUS: above the rendered picture, there is a horizontal selector that allow you to adjust the zoom above the pictures

## Actual assumptions
Photo should be `.jpg` and labes `.txt`, uploaded in ./resources/TOSELECT and in ./resources/LABS
The label should have the name of the picture.
To have different extension please modify `ImageManagerImpl` who handle all the logic behind 
