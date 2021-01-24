This is a wrapper for GetSmsCode and it's written in java.It simplifies your chinese and Usa numbers management (i will add other countries in the future). The wrapper handles the creation of the correct url. There are 4 abstract classes and each one has 2 concrete implementations:
-login
-getNumber
-getSms
-blackList.
Then there is another abstract class, releaseNumber, that has only got the american implementation because i'm not yet sure if a chinese one should exist(i will work on it).
