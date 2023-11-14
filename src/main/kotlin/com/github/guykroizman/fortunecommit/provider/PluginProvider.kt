package com.github.guykroizman.fortunecommit.provider

import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.changes.LocalChangeList
import com.intellij.openapi.vcs.changes.ui.CommitMessageProvider
import kotlin.random.Random

class PluginProvider : CommitMessageProvider {
    override fun getCommitMessage(forChangelist: LocalChangeList, project: Project): String {

        val paradoxum = listOf(
            "A little pain never hurt anyone.",
            """
        Gentlemen, I want you to know that I am not always right, but I am
        never wrong . - Samuel Goldwyn
        """.trimIndent(),
            """
        Honk if you are against noise pollution!
        """.trimIndent(),
            "I'll give you a definite maybe. -Samuel Goldwyn",
            "I am a deeply superficial person. - Andy Warhol",
            "I'm proud of my humility.",
            "I can resist everything except temptation . - Oscar Wilde",
            """
        It isn't an optical illusion. It just looks like one.
        """.trimIndent(),
            """
        May I ask a question?
        """.trimIndent(),
            """
        No one goes to that restaurant anymore - it's always too crowded.
        (attributed to Yogi Berra)
        """.trimIndent(),
            "Thank God I'm an atheist.",
            "This report is filled with omissions.",
            "We are not anticipating any emergencies.",
            "We're overpaying him, but he's worth it. -Samuel Goldwyn",
            "Always be sincere, even when you don't mean it. -Irene Peter",
            """
        Of course I can keep secrets . It 's the people I tell them to that
        can't keep them. -Anthony Haden-Guest
        """.trimIndent(),
            "The best cure for insomnia is to get a lot of sleep . - W.C.Fields",
            "I distinctly remember forgetting that. - Clara Barton",
            "We must believe in free will . We have no choice.- Isaac B.Singer",
            "I'd give my right arm to be ambidextrous.",
            "Monotheism is a gift from the gods.",
            "I never liked you, and I always will. -Samuel Goldwyn",
            """
        After Donald Trump's stretch limousine was stolen and found
        undamaged a few blocks away; he said, "Nothing was stolen. I had
        an honest thief."-International Herald Tribune, page 3, March 2,
        1992
        """.trimIndent(),
            "I tripped over a hole that was sticking up out of the ground.",
            "This page intentionally left blank.",
            "Evil isn't all bad.",
            """
        "It's a step forward although there was no progress."
        President Hosni Murbarak of Egypt attempting to put the best face
        on a disappointing summit meeting between President Clinton and
        the Syrian dictator Hafez Assad.
""".trimIndent(),
            """
        "I always avoid prophesying beforehand because it is much better
        to prophesy after the event has already taken place." - Winston
        Churchill
""".trimIndent(),
            "All truths are true to an extend, including this one.-XA",
            "Assume a virtue, if you have it not. -William Shakespeare",
            "All generalisations are dangerous, including this one.",
            "The word will remain big no matter how much you explore it - Evyatar Kroizman",
            "This is your life, and it's ending one minute at a time. - Fight Club",
            "The things you own end up owning you. - Fight Club",
            "Hitting bottom is not a weekend retreat. It's not a goddamn seminar. Stop trying to control everything, and just let go. Let go! - Tyler Durden",
            "I found freedom. Losing all hope is was freedom. - Fight Club",
            "I flipped through catalogs and wondered, what kind of dining set defines me as a person? - Fight Club",
            "If you died right now, how would you feel about your life? - Tyler Durden",
            "Listen up, maggots. You are not special. You are not a beautiful or unique snowflake. You are the same decaying organic matter as everything else. - Tyler Durden",
            "I love deadlines. I love the whooshing noise they make as they go by. - Douglas Adams, The Salmon of Doubt",
            """The story so far
                   In the beginning the Universe was created. 
                   This has made a lot of people very angry and been widely regarded as a bad move. - Douglas Adams, The Restaurant at the End of the Universe""".trimIndent(),
            "The Guide says there is an art to flying\", said Ford, \"or rather a knack. The knack lies in learning how to throw yourself at the ground and miss. - Douglas Adams, Life, the Universe and Everything",
            "Time is an illusion. Lunchtime doubly so. - Douglas Adams, The Hitchhiker's Guide to the Galaxy",
            "The ships hung in the sky in much the same way that bricks don't. - Douglas Adams, The Hitchhiker's Guide to the Galaxy",
            "For a moment, nothing happened. Then, after a second or so, nothing continued to happen. - Douglas Adams, The Hitchhiker's Guide to the Galaxy",
            "A common mistake that people make when trying to design something completely foolproof is to underestimate the ingenuity of complete fools. - Douglas Adams, Mostly Harmless",
            "I'd far rather be happy than right any day. - Douglas Adams, The Hitchhiker's Guide to the Galaxy",
            "The major difference between a thing that might go wrong and a thing that cannot possibly go wrong is that when a thing that cannot possibly go wrong goes wrong it usually turns out to be impossible to get at or repair. - Douglas Adams, Mostly Harmless",
            "There are two methods in software design. One is to make the program so simple, there are obviously no errors. The other is to make it so complicated, there are no obvious errors. - Tony Hoare",
            "If you can read this, thank a Software Developer. - Joseph M. Abou Nader",
            "I’m not a great programmer; I’m just a good programmer with great habits. - Kent Beck",
            "The best thing about a boolean is even if you are wrong, you are only off by a bit. - Anonymous",
            "Without requirements or design, programming is the art of adding bugs to an empty text file. - Louis Srygley",
            "Before software can be reusable it first has to be usable. - Ralph Johnson",
            "The best performance improvement is the transition from the nonworking state to the working state. - J. Osterhout",
            "Deleted code is debugged code. - Jeff Sickel",
            "Walking on water and developing software from a specification are easy if both are frozen. - Edward V Berard",
            "Software undergoes beta testing shortly before it’s released. Beta is Latin for “still doesn’t work. - Anonymous",
            "It’s not a bug – it’s an undocumented feature. - Anonymous",
            "Software and cathedrals are much the same – first we build them, then we pray. - Anonymous",
            "There are two ways to when it happens. - Woody Allen",
            "I don't want to achieve immortality through my work; I want to achieve immortality through not dying. - Woody Allen",
            "I am thankful for laughter, except when milk comes out of my nose. - Woody Allen",
            "Your highest-value developers are 10x by enabling other developers. - Dan Terhorst-North",
            "With Nine women you can make a baby a month. Wernher von Braun",
            "What one programmer can do in one month, two programmers can do in two months. Fred Brooks",
            "Adding manpower to a late software project makes it later. Fred Brooks",
            "Even a Broken Clock Is Right Twice a Day. - Person looking at your PR",
            "I'm not anti-social. I'm just not social. - Woody Allen",
            "You can live to be a hundred if you give up all the things that make you want to live to be a hundred. - Woody Allen",
            "Confidence is what you have before you understand the problem. - Woody Allen",
            "Code is like humor. When you have to explain it, it’s bad. - Cory House",
            "Clean code always looks like it was written by someone who cares. - Michael Feathers",
            "Write tests. Not too many. Mostly integration. - Kent Beck",
            "Programmer: A machine that turns coffee into code. - Anonymous",
            "When I wrote this code, only God and I understood what I did. Now only God knows. - Anonymous",
            "There is always one more bug to fix - Ellen Ullman",
            "Talk is cheap. Show me the code. - Linus Torvalds",
            "Nobody exists on purpose. Nobody belongs anywhere. We’re all going to die. Come watch TV. - Morty",
            "Sometimes programming is more like art than engineering. - John Carmack",
            "The cost of adding a feature isn't just the time it takes to code it. The cost also includes the addition of an obstacle to future expansion. The trick is to pick the features that don't fight each other. - John Carmack",
            "You can prematurely optimize maintainability, flexibility, security, and robustness just like you prematurely optimize performance. - John Carmack",
            "It is not that uncommon for the cost of an abstraction to outweigh the benefit it delivers. Kill one today! - John Carmack",
            "Well I wish you would just tell me rather than try to engage my enthusiasm. - Marvin the Paranoid Android",
            "So if you want to go fast, if you want to get done quickly, if you want your code to be easy to write, make it easy to read. - Robert C. Martin",
            "Teaching co-workers something over lunch? Record your screen as you do it and put that up on YouTube. - Kent C. Dodds",
            "Nobody wants to work with someone who's unkind. - Kent C. Dodds",
            "Neither spaces nor tabs is the answer. The answer is just use your IDE defaults and move on. - Guy Kroizman"
        )
        val randomIndex = Random.nextInt(paradoxum.size)

        return paradoxum[randomIndex]
    }
}
