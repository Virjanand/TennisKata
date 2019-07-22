# Tennis Refactoring Kata

Imagine you work for a consultancy company, and one of your colleagues has been doing some work for the Tennis Society. The contract is for 10 hours billable work, and your colleague has spent 8.5 hours working on it. Unfortunately he has now fallen ill. He says he has completed the work, and the tests all pass. Your boss has asked you to take over from him. She wants you to spend an hour or so on the code so she can bill the client for the full 10 hours. She instructs you to tidy up the code a little and perhaps make some notes so you can give your colleague some feedback on his chosen design. You should also prepare to talk to your boss about the value of this refactoring work, over and above the extra billable hours.

There are three versions of this refactoring kata, each with their own design smells and challenges. I suggest you start with the first one, with the class "TennisGame1". The test suite provided is fairly comprehensive, and fast to run. You should not need to change the tests, only run them often as you refactor.

If you like this Kata, you may be interested in my book, ["The Coding Dojo Handbook"](https://leanpub.com/codingdojohandbook)

## Tennis Kata

Tennis has a rather quirky scoring system, and to newcomers it can be a little difficult to keep track of. The tennis society has contracted you to build a scoreboard to display the current score during tennis games. 

Your task is to write a “TennisGame” class containing the logic which outputs the correct score as a string for display on the scoreboard. When a player scores a point, it triggers a method to be called on your class letting you know who scored the point. Later, you will get a call “score()” from the scoreboard asking what it should display. This method should return a string with the current score.

You can read more about Tennis scores [here](http://en.wikipedia.org/wiki/Tennis#Scoring) which is summarized below:

1. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
2. The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as "Love", "Fifteen", "Thirty", and "Forty" respectively.
3. If at least three points have been scored by each player, and the scores are equal, the score is "Deuce".
4. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is "Advantage" for the player in the lead.

You need only report the score for the current game. Sets and Matches are out of scope.

## Questions to discuss afterwards

* How did it feel to work with such fast, comprehensive tests?
* Did you make mistakes while refactoring that were caught by the tests?
* If you used a tool to record your test runs, review it. Could you have taken smaller steps? Made fewer refactoring mistakes?
* Did you ever make any refactoring mistakes and then back out your changes? How did it feel to throw away code?
* What would you say to your colleague if they had written this code?
* What would you say to your boss about the value of this refactoring work? Was there more reason to do it over and above the extra billable hour or so?

# Get going quickly with Cyber-dojo

As an alternative to downloading the code, click one of the links below to create a new cyber-dojo to work in, then press "enter" to get going coding.

- [Python](http://cyber-dojo.org/forker/fork/435E5C1C88?avatar=moose&tag=5)
- [Ruby](http://cyber-dojo.org/forker/fork/3367E4B0E9?avatar=raccoon&tag=4)
- [Java](http://cyber-dojo.org/forker/fork/4D363A34A7?avatar=vulture&tag=3)
- [C++](http://cyber-dojo.org/forker/fork/A06DCDA217?avatar=wolf&tag=5)
- [C#](http://cyber-dojo.org/forker/fork/672E047F5D?avatar=buffalo&tag=8)

# To do
- [x] Setup git and project
- [x] Read existing test
- [x] Read kata description
- [ ] Read code
- [x] Use player name in calling wonPoint
- [x] Use string comparison equals not ==
- [x] Move declaration temp variable tempScore
- [x] Extract method for checking single score
- [x] Extract method for checking equal score
- [x] Extract method for checking win or advantage
- [x] Use m_score's to buildScore
- [x] Improve switch with return statements
- [x] Make map of 0 - 4 with strings
- [ ] Replace map with enum for scores?
- [x] Remove unused initialisation for score
- [x] Guard clause for Deuce
- [x] Use convert method to build first equals score
- [x] In getScore use return instead of score variable
- [x] Extract method for check isEndGame
- [x] Split method buildAdvantageOrWinScore
- [x] Use direct returns in buildAdvantageOrWinScore
- [x] Remove duplication calculate difference scores
- [x] Make conditionals for who is ahead more clear
- [x] Inline getDifferenceScore (only used once)
- [x] Remove duplication check who is ahead
- [x] Use playernames
- [x] Extract method getWinningPlayer
- [x] Extract class Score
- [x] Move field m_score1
- [x] Move field m_score2
- [x] Move buildScore() to Score class
- [x] Move buildEqualScore to Score class
- [x] Move scores to Score class
- [x] Move isEndGame
- [x] Change wonPoint by giving increaseScore parameter for player number
- [x] Remove getters and setters on Score
- [x] Move getScore body to Score
- [x] Extract method for isScoreEqual
- [x] Move isScoreEqual to Score
- [x] Use getters for player1Name and player2Name in getWinningPlayer
- [x] Move getWinningPlayer to Score
- [x] Move buildWin to Score
- [x] Extract method getScoreDifference
- [x] Move getScoreDifference to Score
- [x] Move buildAdvantage to Score
- [x] Move buildAdvantageOrWinScore to Score
- [x] Make methods private or package private