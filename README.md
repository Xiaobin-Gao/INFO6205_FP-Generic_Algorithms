# Team INFO6205_221 Final Project Introduction

<i><b>- Team Project</i></b>

## Topic: Genetic Algorithms For Image Evolution
  Apply and Implement Genetic Algorithms to generate images from thousands of randomly generated black dots.
## Implement
* Search all pixels of an input image and save all black dots’ location information as the target.  
* For saving memory and time, we compress the picture into a smaller one.  
* To initialize population for the first generation, we randomly generated 1000 points to set as individuals.  
* Then calculate the total distances of every points in an individual to the target.  
* Use multiplication of inverse for the distance to calculate the fitness, then sum all individuals’ fitness as all . 
* individuals’s total fitness in a generation and then calculate the weight of every individual’s fitness relative to the total fitness value.
* We make 50% possibility for the survival.  
* Use the fitness weighted value to select two individuals and then select the individual with better fitness as father, as well as for the mother. One pair of father and mother will generation 2 childs.  
* Crossover two genes and we have a probability for them to mutate. Use multi-thread for faster speed.  
* Generate the next generation and their genes. The next generation will have a 1% possibly to reduce one individual for the protecting of diversity.  
* If the average weight of the fitness is very close to the best weight of the fitness, we make a big mutation for each individual.  
* Repeat all these steps for 5000 times.  
* Get the result and draw the image every 100 generations, log for each generation.  
## Run
Please run the Driver.class in main.ga package
## Report
[Report is here](Report_221.pdf)
## Picture Result
![picture](final/info6205_FinalProject/resource/target.png) . 

Input image after compress / the best image in the first generation / the best image in the last generation. 

![picture](final/info6205_FinalProject/resource/compress.png) . 
![picture](final/info6205_FinalProject/resource/gen0.png) . 
![picture](final/info6205_FinalProject/resource/result.png)     

Image evolution process

![picture](final/info6205_FinalProject/resource/gen0.png) . 
![picture](final/info6205_FinalProject/resource/gen99.png) . 
![picture](final/info6205_FinalProject/resource/gen198.png) . 
![picture](final/info6205_FinalProject/resource/gen990.png) . 
![picture](final/info6205_FinalProject/resource/gen1980.png) . 
![picture](final/info6205_FinalProject/resource/gen2970.png) . 
![picture](final/info6205_FinalProject/resource/gen3960.png) . 
![picture](final/info6205_FinalProject/resource/gen4950.png) . 
![picture](final/info6205_FinalProject/resource/result.png)     
