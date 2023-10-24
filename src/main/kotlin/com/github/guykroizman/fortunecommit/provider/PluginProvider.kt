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
        A unified, neutral Germany? Given that nation's heritage, such a
        phrase may prove to be the oxymoron of the decade ." -Kevin M.
        Matarese, Fulda, West Germany; as seen in "Letters", Time
        magazine, p. 5, March 5, 1990.
        """.trimIndent(),
                """
        A verbal contract isn 't worth the paper it' s written on . Include
                me out . - Samuel Goldwyn
        """.trimIndent(),
                """
        Christ was born in 4 B . C .
        """.trimIndent(),
                """
        Cum tacent, clamant. When they are silent, they shout.-Cicero
        """.trimIndent(),
                """
        Gentlemen, I want you to know that I am not always right, but I am
        never wrong . - Samuel Goldwyn
        """.trimIndent(),
                """
        Goes(Went) over like a lead balloon .
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
        If you fall and break your legs, don't come running to me. 
                -Samuel Goldwyn
        """.trimIndent(),
                """
        I never put on a pair of shoes until I 've worn them five years.
        --Samuel Goldwyn
        """.trimIndent(),
                """
        It isn 't an optical illusion. It just looks like one.
        """.trimIndent(),
                """
        It's more than magnificent-it's mediocre.-Samuel Goldwyn
        """.trimIndent(),
                """
        May I ask a question?
        """.trimIndent(),
                """
        No one goes to that restaurant anymore - it's always too crowded.
        (attributed to Yogi Berra)
        """.trimIndent(),
                """
        Our comedies are not to be laughed at . - Samuel Goldwyn
        """.trimIndent(),
                """
        Parting is such sweet sorrow.-William Shakespeare
        """.trimIndent(),
                """
        Procrastination means never having to say you're sorry.
        """.trimIndent(),
                """
        "Professional certification for car people may sound like an
        oxymoron." -The Wall Street Journal, page B1, Tuesday, July 17,
        1990.
        """.trimIndent(),
                """
        Referring to a book : I read part of it all the way through .
        --Samuel Goldwyn
        """.trimIndent(),
                """
        Smoking is the leading cause of statistics.
        """.trimIndent(),
                """
        Some bachelors want a meaningful overnight relationship.
        """.trimIndent(),
                """
        Talking about a piece of movie dialogue: Let's have some new
        cliches.- Samuel Goldwyn
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
                """
        After they got rid of capital punishment, they had to hang twice
        as many people as before .
""".trimIndent(),
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
        Some bird populations soaring down
        -Headline of an article in
        Science News, page 126, February 20, 1993.
""".trimIndent(),
                """
        Most bacteria have the decency to be microscopic . Epulopiscium
                fishelsoni is not among them. The newly identified one-celled
        macro - microorganism is a full .5 mm long, large enough to be seen
        with the naked eye . Described in the current Nature, "It is a
        million times as massive as a typical bacterium ."-Time, page 25,
        March 29, 1993
""".trimIndent(),
                """
        "Triumph without Victory, The Unreported History of the Persian
        Gulf War ", -Headline published in the U.S. News & World Report,
        1992.
""".trimIndent(),
                """
        An empty cab drove up and Sarah Bernhardt got out . - Arthur Baer,
        American comic and columnist
""".trimIndent(),
                """
        She used to diet on any kind of food she could lay her hands on.
        --Arthur Baer, American comic and columnist
""".trimIndent(),
                "The first condition of immortality is death. -Stanislaw Lec",
                "As famous as the unknown soldier.",
                "I must follow the people. Am I not their leader? -Benjamin Disraeli",
                """
        Hegel was right when he said that we learn from history that man
         can never learn anything from history . - George Bernard Shaw""".trimIndent(),
                """
        William Safire 's rules for writing as seen in the New York Times

        Do not put statements in the negative form .
        And don 't start sentences with a conjunction.
        If you reread your work, you will find on rereading that a great
        deal of repetition can be avoided by rereading and editing .
        Never use a long word when a diminutive one will do.Unqualified superlatives are the worst of all.If any word is improper at the end of a sentence, a linking verb is .
        Avoid trendy locutions that sound flaky .
        Never, ever use repetitive redundancies.
        Also, avoid awkward or affected alliteration.
        Last, but not least, avoid cliches like the plague.
""".trimIndent(),
                "Everyone writes on the walls except me.- Said to be graffiti seen in Pompeii",
                "I tripped over a hole that was sticking up out of the ground.",
                """
        I don 't think anyone should write their autobiography until after
        they're dead. -Samuel Goldwyn
""".trimIndent(),
                "This page intentionally left blank.",
                "Evil isn't all bad.",
                "I disagree with unanimity.",
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
        )
        val randomIndex = Random.nextInt(paradoxum.size)

        return paradoxum[randomIndex]
    }
}