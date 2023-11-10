---
layout: page
title: Devanshu Bisht's Project Portfolio Page
---

### Project: CodeSphere

**CodeSphere** is a desktop **contact management app, optimised for use via a Command Line Interface (CLI)** while still having the benefits of a Graphical User Interface (GUI). It is an app targeted at connecting Year 1 Computer Science students in the NUS School of Computing.

Given below are my contributions to the project.

* **New Feature**: Find Command.
  * What it does: Finds students in a course based on different critereas. It is implemented such that the order and case of the words searched for does not matter.
  * Justification: This features allows teaching assistants to quickly search for students based on any attribute of the student. Its difficult to keep track of all the details of students and TAs may at times only recall partial information. Through this feature they can find for any word or incomplete sentence to find a possible match for the specified criteria in their student list.
  * Highlights: This enhancement required the development of different predicates for each attribute of the student. It also works intricately with the Course class to ensure that the filtered list of students is appropriately updated. It also adds functions to the StringUtil class to better allign the logic behind magic more catered to our use case.

* **New Feature**: StageManager & Stages.
  * What it does: Allows our application to know which stage the user is at to parse the relevant commands correctly. It also helps to UiManager to know which which components to display.
  * Justification: This features allows users to not have the need to write length commands based on which section they are at. For example, our application is able to automatically detect if the `add` command should add a student or course. The logic also prevents bugs from happenning as we restrict the usage of some commands based on which stage they are at.
  * Highlights: This enhancement affects existing commands and commands to be added in future. It required an in-depth analysis of design alternatives. The implementation too was challenging as it required changes to classes such as LogicManager and CodeSphereParser.

* **New Feature**: Home.
  * What it does: Allows users to visit back home when they are viewing a student list of a selected course.
  * Justification: A user friendly command to allow user to navigate back to the home page which contains all the courses.
  * Highlights: This command needed to be implemented appropriately such that our application Stage would be implemented correctly.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=devanshu&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code&since=2023-09-22&tabOpen=true&tabType=authorship&tabAuthor=devanshubisht&tabRepo=AY2324S1-CS2103T-W15-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

* **Project management**:
    * Generated and managed issues for the progress of the app for `v1.2`-`v1.4` on GitHub.

* **Enhancements to existing features**:
    * Update StringUtil component for the app (PR [#165](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/165))
    * Update CodeSphereParser component for the app (PR [#77](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/77))
    * Added and updated test files for several classes and existing features to align with the app's functions ([#300](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/300), [#299](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/#299))

* **Documentation**:
    * User Guide:
        * Added documentation for the features `find` (Student), `find` (Course) `pq`, `remove`  (PR [#195](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/195), PR [#127](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/127))
        * Fixed user guide links in the table of content (PR [#311](https://github.com/AY2324S1-CS2103T-W15-4/tp/pull/311))
    * Developer Guide:
        * To be added soon.

* **Community**:
    * Reviewed PRs, and suggested improvements for things like Javadoc style and code quality.
    * Reported bugs for other teams during PE-D and suggested possible improvements. Can be seen [here](https://github.com/devanshubisht/ped).
