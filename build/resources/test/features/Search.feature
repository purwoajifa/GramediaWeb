@Search
Feature: Search

#  Background:
#    Given User is on Gramedia Landing Page

  @SearchBook
  Scenario: Search Book
    Given User is on Gramedia Landing Page
    When User search "Doraemon" in searchbar
    Then User in search result "Doraemon"