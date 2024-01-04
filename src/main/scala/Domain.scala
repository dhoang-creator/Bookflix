// You're using the 'field_name_map' data found at the OpenLibrary Github Schemes
object Domain {

  // we need to check that this is the returned data when we request data -> refer to the OpenLibraries JSON Response header
  private type Author = String
  private type Authors = List[String]
  private type pages = Int
  private type Publishers = List[String]
  private type Title = String

}
