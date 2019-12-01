# course-api
-springboot api managing topic , courses and lessons

-This api uses an embeded apached derby db to persist the above listed subjects

-It performs crud operation on each following their relational tree

 #where
 
  -topic has many courses hence OneTMany  and reverse is true
  
  -course has many lessons hence OneToMany and reverse is true
  
  
