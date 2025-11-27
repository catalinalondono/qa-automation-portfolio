Feature:  Login Iseries

  Scenario:Login user in iseries
    Given the user connects to the iSeries system
    When the user executes the query
    Then the response should contain valid data
