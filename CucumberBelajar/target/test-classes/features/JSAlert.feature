Feature: Asersi kalimat pada Pop Up Alert

  Scenario: User click tombol JS Alert
    Given User Buka Websitenya
    When User Klik Tombol JS Alert
    Then User melihat Pop Up muncul dan melakukan asersi
    And Close

  Scenario: User click tombol OK pada Pop Up
    Given User Buka Websitenya
    When User Klik Tombol JS Alert
    And User melihat Pop Up muncul dan melakukan asersi
    And User Klik Tombol Ok JS Alert
    Then Asersi kalimat yang muncul
    And Close

  Scenario: User click tombol JS Confirm
    Given User Buka Websitenya
    When User Klik Tombol JS Confirm
    Then User melihat Pop Up muncul dan melakukan asersi JS Confirm
    And Close

  Scenario: User click tombol Cancel pada Pop Up
    Given User Buka Websitenya
    And User Klik Tombol JS Confirm
    And User melihat Pop Up muncul dan melakukan asersi JS Confirm
    When Klik Tombol Cancel Pop Up JS Confirm
    Then Asersi kalimat yang muncul setelah klik tombol Cancel JS Confirm
    And Close
#
#  Scenario: User click tombol OK pada Pop Up
#    When Klik Tombol OK Pop Up JS Confirm
#    Then Asersi kalimat yang muncul setelah klik tombol OK JS Confirm
#
#  Scenario: User click tombol JS Prompt
#    When User Klik Tombol JS Prompt
#    Then User melihat Pop Up muncul dan melakukan asersi JS Prompt
#
#  Scenario: User click tombol Cancel pada Pop Up JS Prompt
#    When Klik Tombol Cancel Pop Up JS Prompt
#    Then Asersi kalimat yang muncul setelah klik tombol Cancel JS Prompt
#
#  Scenario: User click tombol OK pada Pop Up JS Prompt
#    When Isi Nama
#    And  Klik Tombol OK Pop Up JS Prompt
#    Then Asersi kalimat yang muncul setelah klik tombol OK JS Prompt