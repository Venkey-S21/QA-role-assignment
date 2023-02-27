Feature: Testing the functionality Sending new mail Using Gmail

  Scenario Outline: Verify the sent mail with provided conditions
    Given Launch the browser
    When Navigate to Gmail home page
    And Click on Signin button
    And Enter valid <username> and click on enter
    And Enter valid <password> and click on submit
    Then Click on compose button
    And Enter <ToMail> and <MailSub> also <MailBody>
    And Click on more options and select label as social
    And Click on send button
    Then Go to social label and mark email as starred
    And Verify email came under proper Label
    And Verify the subject and body of the received email
    Then Close the web browser

    Examples: 
      | username             | password | ToMail               | MailSub   | MailBody        |
      | konduru201@gmail.com | password | konduru201@gmail.com | Test Mail | Test Email Body |
