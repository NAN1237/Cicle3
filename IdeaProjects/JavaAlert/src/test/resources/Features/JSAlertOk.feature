Feature: Asersi kalimat pada JS Alert setelah klik Tombol Ok Pop Up
  Scenario: User click tombol OK pada Pop Up
    Given Tampilan PopUp JS Alert
    When Klik Tombol Ok JS Alert
    Then Asersi kalimat yang muncul