println("Starting demo of functional and imperative way of programming")

def prepareBase(a : String) : String = " preparing Base "+a
def prepareToppings(b : String) : String = " preparing Toppings"+b
def deliverPizza(c : String) : String = " Delivering to Customer  "+c

deliverPizza(prepareToppings(prepareBase("Cheese")))

val funcChainingExample = prepareBase _ andThen prepareToppings andThen deliverPizza
funcChainingExample("Cheese")

(0 to 100).par.map(x => x * x)

Array(0, 3, 4).map(println)

val dayOfWeek = 4
val day = dayOfWeek match {
  case 1 => "Sunday"
  case 2 => "Monday"
  case 3 => "Tuesday"
  case 4 => "Wednesday"
  case 5 => "Thursday"
  case 6 => "Friday"
  case 7 => "Saturday"
  case _ => "Invalid" //matches everything else
}

