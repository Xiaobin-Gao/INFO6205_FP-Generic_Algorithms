# INFO6205_221
## Final Project Introduction
### Topic: Genetic Algorithms For Image
  Give a picture with color white and black and return a picture that looks like the orignal one.
### Implement
*  Search all pixels of the input picture and get the location information of all black points to be as the target.  
*  For memory and time saving consideration, we compress the picture and get fewer pixels for excuting quicker.  
*  Generate 1000 random set of points as first generation.  
*  Calculate the total distance between one set and target points.  
*  Use 1/distance as fitness of one individual. Sum all the adaptance and calculate the rate for the individual in the generation.  
*  Suvive half of the population each generation.  
*  Using the adaptance to select two individuals and select higher adaptance indvidual as father. The same with mother.  
*  Convert a 8 bytes array to a point is as expression. And convert one point to a 8 bytes array is reverse.  
*  Crossover two genes and mutation is in the process.  
*  Generate the next genration and their gene.
*  Loop all these steps for around 1000 times.
*  Get the result and draw picture each 100 generation, log for each generation.
