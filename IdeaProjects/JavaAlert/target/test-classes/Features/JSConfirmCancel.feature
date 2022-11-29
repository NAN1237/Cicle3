Feature: Asersi kalimat pada JS Confirm setelah klik Tombol Cancel Pop Up
    Scenario: User click tombol Cancel pada Pop Up
        Given Tampilan PopUp JS Confirm
        When Klik Tombol Cancel Pop Up JS Confirm
        Then Asersi kalimat yang muncul setelah klik tombol Cancel JS Confirm