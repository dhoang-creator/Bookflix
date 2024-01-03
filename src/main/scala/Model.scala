// Using the OpenLibrary API, we want to make an API request to this site and process the responses for the user

// Going back to basics, is it wise to have case classes which contain primitive data types?
case class response(author: Author)

// matching the below with the above?
case class Author(author: String)
