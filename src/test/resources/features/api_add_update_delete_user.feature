@smoketest
Feature: API - Add / Update / Delete user
  Scenario: Add User
    And I create user with payload "{'name':'Tenali Ramakrishna-copy', 'gender':'male', 'email':'112teyunalishnfddfdfdfdfdfdfa.copy@15ce.com', 'status':'active'}"
    And I get user with id "tv!id"
    And I verify response body item "name" is "Tenali Ramakrishna-copy"

  Scenario: Update User
    And I update user "tv!id" with payload "{'name':'Tenali Ramakrishna-copy-update', 'gender':'male', 'email':'new112teyunalishnfddfdfdfdfdfdfa.copy@15ce.com', 'status':'inactive'}"
    And I get user with id "tv!id"
    And I verify response body item "name" is "Tenali Ramakrishna-copy-update"

  Scenario: Update User - Negative - Assertion on user name is failed
    And I update user "tv!id" with payload "{'name':'Tenali Ramakrishna-copy-update', 'gender':'male', 'email':'new112teyunalishnfddfdfdfdfdfdfa.copy@15ce.com', 'status':'inactive'}"
    And I get user with id "tv!id"
    And I verify response body item "name" is "Tenali Ramakrishna-copy-failed"

  Scenario: Delete User
    And I delete user with id "tv!id"
    And I get user with id "tv!id"
    And I verify response body item "message" is "Resource not found"
