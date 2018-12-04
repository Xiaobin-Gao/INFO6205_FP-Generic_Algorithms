# INFO6205_221
## Final Project Introduction
### Topic: Genetic Algorithms For Image
  Give a black-and-white picture and return a picture that looks like the orignal one.
### Implement
*  Search all pixels of an input picture and save all black points' location information as the target.  
*  For memory and time saving consideration, we compress the picture to get a smaller target.  
*  To initialize population for the first generation, 1000 point sets are randomly produced as individuals.  
*  To calculate an individual's fitness, use 1/distance, where distance means the totoal distance of all points in the individual to its corresponding points in the target.
*  Sum all individuals' fitness as population's total fitness and then calculate the weight of every individual' fitness relative to that total fitness value.  
*  Survive half of the population to the next generation.  
*  Use the fitness weight value to select two best individuals and then select better one as father. Repeat the same process to select mother.  
*  To convert phenotype to genetype, convert every point in an individual to an 8-byte array; To convert genetype to phenotype, convert every 8-byte array in an individual to a point.
*  Crossover two genes and mutation are in the process.  
*  Generate the next genration and their gene.
*  repeat all these steps about 1000 times.
*  Get the result and draw an picture every 100 generations, log for each generation.
