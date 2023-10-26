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
            """I'm not going to say, "I told you so.""",
            "I am a deeply superficial person . - Andy Warhol",
            "I'm proud of my humility.",
            "I can resist everything except temptation . - Oscar Wilde",
            """If Roosevelt were alive, he'd turn over in his grave. 
                -Samuel Goldwyn""".trimIndent(),
            """
        If I could drop dead right now, I'd be the happiest man alive!
        --Samuel Goldwyn
        """.trimIndent(),
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
            """
        Parting is such sweet sorrow.-William Shakespeare
        """.trimIndent(),
            """
        Procrastination means never having to say you're sorry.
        """.trimIndent(),
            """
        The scene is dull . Tell him to put more life into his dying .
        --Samuel Goldwyn
        """.trimIndent(),
            "Thank God I'm an atheist.",
            "This report is filled with omissions.",
            "We are not anticipating any emergencies.",
            "We're overpaying him, but he's worth it. -Samuel Goldwyn",
            """
        His honour rooted in dishonour stood,
        And faith unfaithful kept him falsely true.
        --Alfred Lord Tennyson
        """.trimIndent(),
            """
        The good oxymoron, to define it by a self-illustration, must be a
        planned inadvertency . - Wilson Follett
        """.trimIndent(),
            "An Irishman is never at peace except when he 's fighting.",
            "I marvel at the strength of human weakness.",
            "Always be sincere, even when you don't mean it. -Irene Peter",
            """
        Live within your income, even if you have to borrow to do so.
        --Josh Billings
        """.trimIndent(),
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
            "Why don 't you pair `em up in threes? -Yogi Berra",
            """
        Our similarities are different . - Dale Berra, son of Yogi
""".trimIndent(),
            """
        After Donald Trump's stretch limousine was stolen and found
        undamaged a few blocks away; he said, "Nothing was stolen. I had
        an honest thief."-International Herald Tribune, page 3, March 2,
        1992
""".trimIndent(),
            """
        Most bacteria have the decency to be microscopic . Epulopiscium
                fishelsoni is not among them. The newly identified one-celled
        macro - microorganism is a full .5 mm long, large enough to be seen
        with the naked eye . Described in the current Nature, "It is a
        million times as massive as a typical bacterium ."-Time, page 25,
        March 29, 1993
""".trimIndent(),
            "The first condition of immortality is death. -Stanislaw Lec",
            "As famous as the unknown soldier.",
            "I must follow the people. Am I not their leader? -Benjamin Disraeli",
            """
        Hegel was right when he said that we learn from history that man
         can never learn anything from history . - George Bernard Shaw""".trimIndent(),
            "I tripped over a hole that was sticking up out of the ground.",
            """
        I don 't think anyone should write their autobiography until after
        they're dead. -Samuel Goldwyn
""".trimIndent(),
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
            "There are two ways to write error-free programs; only the third one works. - Alan J. Perlis",
            "Ready, fire, aim: the fast approach to software development. Ready, aim, aim, aim, aim: the slow approach to software development. - Anonymous",
            "It’s not that I’m so smart, it’s just that I stay with problems longer. - Albert Einstein",
            "The trouble with programmers is that you can never tell what a programmer is doing until it’s too late. - Seymour Cray",
            "Don’t worry if it doesn’t work right. If everything did, you’d be out of a job. - Mosher’s Law of Software Engineering",
            "A good programmer is someone who always looks both ways before crossing a one-way street. - Doug Linder",
            "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live. - Martin Golding",
            "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. - Martin Fowler",
            "Computers are good at following instructions, but not at reading your mind. - Donald Knuth",
            "First, solve the problem. Then, write the code. - John Johnson",
            "If you automate a mess, you get an automated mess. - Rod Michael",
            "If debugging is the process of removing software bugs, then programming must be the process of putting them in. - Edsger Dijkstra",
            "It’s all talk until the code runs. - Ward Cunningham",
            "Measuring programming progress by lines of code is like measuring aircraft building progress by weight. - Bill Gates",
            "Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program. - Linus Torvalds",
            "One man’s crappy software is another man’s full-time job. - Jessica Gaston",
            "Programming can be fun, so can cryptography; however they should not be combined. - Kreitzberg and Shneiderman",
            "Open close principle: Software entities like classes, modules and functions should be open for extension but closed for modifications. - Bertrand Meyer",
            "The best way to get a project done faster is to start sooner. - Jim Highsmith",
            "The best performance improvement is the transition from the nonworking state to the working state. - J. Osterhout",
            "The cheapest, fastest, and most reliable components are those that aren’t there. - Gordon Bell",
            "The first 90% of the code accounts for the first 90% of the development time. The remaining 10% of the code accounts for the other 90% of the development time. - Tom Cargill",
            "The most important single aspect of software development is to be clear about what you are trying to build. - Bjarne Stroustrup",
            "The most likely way for the world to be destroyed, most experts agree, is by accident. That’s where we come in; we’re computer professionals. We cause accidents. - Nathaniel Borenstein",
            "The only way to learn a new programming language is by writing programs in it. - Dennis Ritchie",
            "The sooner you start to code, the longer the program will take. - Roy Carlson",
            "We can solve any problem by introducing an extra level of indirection. - David Wheeler. except we can’t solve the problem of too many layers of indirection. - Kevlin Henney",
            "Weeks of coding can save you hours of planning. - Anonymous",
            "If you are going through hell, keep going. - Winston Churchill",
            "If you can’t explain it simply, you don’t understand it well enough. - Albert Einstein",
            "If you don’t fail at least 90 percent of the time, you’re not aiming high enough. - Alan Kay",
            "If you spend too much time thinking about a thing, you’ll never get it done. - Bruce Lee",
            "If you think your users are idiots, only idiots will use it. - Linus Torvalds",
            "If you want to increase your success rate, double your failure rate. - Thomas Watson Jr.",
            "It’s not a bug – it’s an undocumented feature. - Anonymous",
            "Personally I'm always ready to learn, although I do not always like being taught. - Winston Churchill",
            "I may be drunk, Miss, but in the morning I will be sober and you will still be ugly. - Winston Churchill",
            "History will be kind to me for I intend to write it. - Winston Churchill",
            "There are three kinds of lies: lies, damned lies, and statistics. - Benjamin Disraeli",
            "The only thing to do with good advice is to pass it on. It is never of any use to oneself. - Oscar Wilde",
            "Some cause happiness wherever they go; others whenever they go. - Oscar Wilde",
            "The truth is rarely pure and never simple. - Oscar Wilde",
            "Always forgive your enemies; nothing annoys them so much. - Oscar Wilde",
            "To live is the rarest thing in the world. Most people exist, that is all. - Oscar Wilde",
            "The old believe everything, the middle-aged suspect everything, the young know everything. - Oscar Wilde",
            "We are all in the gutter, but some of us are looking at the stars. - Oscar Wilde",
            "A gentleman is one who never hurts anyone's feelings unintentionally. - Oscar Wilde",
            "Experience is simply the name we give our mistakes. - Oscar Wilde",
            "I don't want to go to heaven. None of my friends are there. - Oscar Wilde",
            "I am not afraid of death; I just don't want to be there when it happens. - Woody Allen",
            "I don't want to achieve immortality through my work; I want to achieve immortality through not dying. - Woody Allen",
            "I am thankful for laughter, except when milk comes out of my nose. - Woody Allen",
        )
        val randomIndex = Random.nextInt(paradoxum.size)

        return paradoxum[randomIndex]
    }
}