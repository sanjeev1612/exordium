def isPrime(n: Int) =  (2 to n).filter(n % _ == 0).length==0

isPrime(5)

def factorial(num:Int) :Int ={
  if(num == 0) 1 else num * factorial(num-1)
}

factorial(5)