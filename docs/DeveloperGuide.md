---
layout: page
title: Developer Guide
---
* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------

## **Acknowledgements**

* {list here sources of all reused/adapted ideas, code, documentation, and third-party libraries -- include links to the original source as well}

--------------------------------------------------------------------------------------------------------------------

## **Setting up, getting started**

Refer to the guide [_Setting up and getting started_](SettingUp.md).

--------------------------------------------------------------------------------------------------------------------
## **Appendix: Requirements**

### Product scope

**Target user profile**:

* not used to the university environment
* feels overwhelmed by courses, CCAs and other school things
* wants to connect with seniors & peers to discuss about school work
* wants to connect with like-minded individuals with similar interests
* prefer desktop apps over other types
* prefers typing to mouse interactions
* is reasonably comfortable using CLI apps

**Value proposition**: easily search and connect with like-minded students amongst the large cohort of Computer Science students in NUS, based on different categories.


### User stories

Priorities: High (must have) - `* * *`, Medium (nice to have) - `* *`, Low (unlikely to have) - `*`

| Priority | As a …​                                    | I want to …​                     | So that I can…​                                                        |
| -------- | ------------------------------------------ | ------------------------------ | ---------------------------------------------------------------------- |
| `* * *`  | new user                                   | create a profile on CodeSphere          | let others know my name, phone number and email.                 |
| `* * *`  | user                                       | add details to my profile                |  let others see my profile and know what I am doing.                                                                      |
| `* * *`  | user                                       | remove any details on my profile                | remove certain details if I want to.                                  |
| `* * *`  | user                                       | delete my entire user profile          | remove them if I want to. |
| `* *`    | user                                       | show my own user profile, including basic profile information and all additional information   | check on my own profile when I want to do so.                |

*{More to be added}*

### Use cases

(For all use cases below, the **System** is the `CodeSphere` and the **Actor** is the `user`, unless specified otherwise)

**Use case: Add additional details to your own profile**

**MSS**

1.  User navigates to their profile
2.  CodeSphere shows all existing details
3.  User adds additional details for some categories in their profile page
4.  User saves the new details
5. CodeSphere saves the profile with new details
6. CodeSphere shows the updated profile page

    Use case ends.

**Extensions**

* 2a. All categories have already been filled up.
    
    * 2a1. CodeSphere prompts user to edit existing information.
    * 2a2. User edits existing details. </br> 
      Use case resumes at step 4.
  

* 3a. CodeSphere detects incorrect input format for details.
    * 3a1. CodeSphere prompts user to enter details in the correct format.
    * 3a2. User enters details again.

      Use case resumes at step 4.

**Use case:  Delete a profile**

**Preconditions**: User has an existing profile

**MSS**

1. User navigates to their profile.
2. CodeSphere shows the profile page.
3. User chooses to delete their entire profile.
4. CodeSphere prompts the user to confirm the deletion.
5. User confirms the deletion.
6. CodeSphere deletes the user profile.

   Use case ends.

**Extensions**

* 4a. User decides not to delete their profile.

    * 4a1.  User indicates that they do not wish to proceed with the deletion during confirmation.
      Use case resumes at step 2.

*{More to be added}*

### Non-Functional Requirements

1.  Should work on any _mainstream OS_ as long as it has Java `11` or above installed.
2.  The application should be able to handle an increasing number of profiles and users without a significant degradation in performance.
3.  The application should gracefully handle errors, providing informative error messages to users in case of failures.
4.  Code should be organized into reusable and maintainable modules, making it easier to enhance and extend the application in the future.
5.  Maintain comprehensive documentation for developers.
6.  The application should run smoothly on different operating systems commonly used by the target users.
7.  Ensure that only authorized users can access and manipulate profile information.

*{More to be added}*

### Glossary

* **Mainstream OS**: Windows, Linux, Unix, OS-X
* **CLI**: Command Line Interface. A way to interact with a computer or software by typing text-based commands, rather than using a mouse and graphical icons.

--------------------------------------------------------------------------------------------------------------------
