# INFO6205_221
## Final Project Introduction
### Topic: Genetic Algorithms For Image
  Give a picture with color white and black and return a picture that looks like the orignal one.
### Implement
*  Search all pixels of the input picture and save all black points' location information as the target.  
*  For memory and time saving consideration, we compress the picture and thus have a smaller target.  
*  To initialize population of the first generation, randomly generate 1000 sets of points.  
*  Calculate the total distance of every point set to the target.  
*  Use 1/distance as fitness of one individual. Sum all the adaptance and calculate the rate for the individual in the generation.  
*  Survive half of the population to the next generation.  
*  Using the adaptance to select two individuals and select higher adaptance indvidual as father. The same with mother.  
*  Convert a 8 bytes array to a point is as expression. And convert one point to a 8 bytes array is reverse.  
*  Crossover two genes and mutation is in the process.  
*  Generate the next genration and their gene.
*  Loop all these steps for around 1000 times.
*  Get the result and draw picture each 100 generation, log for each generation.
