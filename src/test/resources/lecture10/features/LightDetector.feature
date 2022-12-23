Feature: Light detector

  Scenario: Visible light
    When light shines 340 Hz
    Then it should be "Invisible"

  Scenario: Violet light
    When light shines 440 Hz
    Then it should be "Violet"

  Scenario: Blue light
    When light shines 490 Hz
    Then it should be "Blue"