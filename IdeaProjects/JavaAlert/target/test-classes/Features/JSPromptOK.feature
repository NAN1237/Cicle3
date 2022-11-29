Feature: Asersi kalimat pada JS Prompt setelah isi Nama klik Tombol OK Pop Up
  Scenario: User click tombol OK pada Pop Up JS Prompt
    Given Tampilan PopUp JS Prompt OK
    When Isi Nama
    And  Klik Tombol OK Pop Up JS Prompt
    Then Asersi kalimat yang muncul setelah klik tombol OK JS Prompt