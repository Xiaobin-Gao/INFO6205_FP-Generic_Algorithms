# INFO6205_221
## Final Project Introduction
### Topic: Genetic Algorithms For Image
  Give a picture with color white and black and return a picture that looks like the orignal one.
### Implement
*  Search all pixels of an input picture and save all black points' location information as the target.  
*  For memory and time saving consideration, we compress the picture first and thus get a smaller target.  
*  To initialize population for the first generation, randomly generate 1000 point sets as individuals.  
*  Calculate the total distance of every points in an individual to the target.  
*  Use 1/distance to calculate an individual's fitness. Sum all individuals' fitness as all individuals' total fitness in a generation and then calculate the weight of every individual' fitness relative to that total fitness value.  
*  Survive half of the population to the next generation.  
*  Using the fitness weight value to select two individuals and then select the indvidual with better fitness as father. Repeat the same process to select mother.  
*  Convert a 8 bytes array to a point is as expression. And convert one point to a 8 bytes array is reverse.  
*  Crossover two genes and mutation are in the process.  
*  Generate the next genration and their gene.
*  repeat all these steps about 1000 times.
*  Get the result and draw an picture every 100 generations, log for each generation.
