import scalaj.http.{Http, HttpOptions}

object tester extends App{

  val result = Http("https://y4xvbk1ki5.execute-api.us-west-2.amazonaws.com/CS/v1/cards").
    postData("""{"fullName":"John Smith","dateOfBirth":"1990/01/23","creditScore":"500"}""")
    .header("Content-Type", "application/json")
    .header("Charset", "UTF-8")
    .option(HttpOptions.readTimeout(10000)).asString
  println(result)
}