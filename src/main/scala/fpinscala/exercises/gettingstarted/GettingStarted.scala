package fpinscala.exercises.gettingstarted

object MyProgram:
  def fib(n: Int): Int =
    @annotation.tailrec
    def go(n: Int, current: Int, next: Int): Int =
      if (n <= 0) current
      else go(n-1, next, current + next)
    
    go(n, 0, 1)

/**
  * n = 5の場合
  * 
  * go(5, 0, 1)
  * return go(4, 1, 0 + 1)
  * 
  * go(4, 1, 1)
  * return go(3, 1, 1 + 1)
  * 
  * go(3, 1, 2)
  * return go(2, 2, 1 + 2)
  * 
  * go(2, 2, 3)
  * return go(1, 3, 2 + 3)
  * 
  * go(1, 3, 5)
  * return(0, 5, 3 + 5)
  * 
  * go(0, 5, 8)
  * return 5
  */

