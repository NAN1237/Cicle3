Feature: Asersi kalimat pada JS Confirm setelah klik Tombol OK Pop Up
  Scenario: User click tombol OK pada Pop Up
    Given Tampilan PopUp JS Confirm OK
    When Klik Tombol OK Pop Up JS Confirm
    Then Asersi kalimat yang muncul setelah klik tombol OK JS Confirm