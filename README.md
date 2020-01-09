# TOTSimple

Stands for Time On Top Simple. It's a clock that is always ontop of your screen.

A simple always on the top clock programmed in broken java code and a hefty dose of RAGE. It works, eats about 70-80 MB Ram. I am only providing the source because people should rightfully inspect where their software come from and what it contains. Vegans not welcome.
It's not really that complicated of a program at all and the buttons are self-explanatory. So a README
is not really neccesary, except.

The only thing you need to be aware off is that timezone textbox input is not sanitized. If you enter 
something other than what is expected the timer responsible for updating the clock label will get fried
and you will need to restart the program.

That is on TODO btw. Will DO it when I feel like it. :)


Timezones:

Since the timer currently gets fried if you enter things incorrectly, here's a short guide on how to get timezones.
The software is on Europe/Stockholm by default. The program will not remember anything (aka no config file, that's for later when I feel like it). 

Go to this webpage: https://www.mkyong.com/java/java-display-list-of-timezone-with-gmt/
Copy&paste the Continent/Region. For example 
"America/Vancouver" (without "") into the white little textfield next to the "Change TimeZone" button. 
Ensure that no spaces are present at all.
And then press it. If for some reason your city/town whatever is not on that webpage. Pick the next best thing that matches your time.
Give it a sec or two and presto timezone changed.
Ensure that no spaces are present at all.

You will need to redo this each time the software is closed as the software is hardcoded to "Europe/Stockholm".
