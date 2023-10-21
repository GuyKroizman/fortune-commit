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
                """
        Thank God I'm an atheist.
        """.trimIndent(),
                """
        This report is filled with omissions .
        """.trimIndent(),
                """
        We are not anticipating any emergencies .
        """.trimIndent(),
                """
        We're overpaying him, but he's worth it.-Samuel Goldwyn
        """.trimIndent(),
                """
        His honour rooted in dishonour stood,
        And faith unfaithful kept him falsely true.
        --Alfred Lord Tennyson
        """.trimIndent(),
                """
        The good oxymoron, to define it by a self-illustration, must be a
        planned inadvertency . - Wilson Follett
        """.trimIndent(),
                """
        An Irishman is never at peace except when he 's fighting.
        """.trimIndent(),
                """
        I marvel at the strength of human weakness .
        """.trimIndent(),
                """
        Always be sincere, even when you don't mean it. -Irene Peter
        """.trimIndent(),
                """
        Live within your income, even if you have to borrow to do so.
        --Josh Billings
        """.trimIndent(),
                """
        Of course I can keep secrets . It 's the people I tell them to that
        can't keep them. -Anthony Haden-Guest
        """.trimIndent(),
                """
        The best cure for insomnia is to get a lot of sleep . - W.C.Fields
        """.trimIndent(),
                """
        I distinctly remember forgetting that.- Clara Barton
""".trimIndent(),
                """
        We must believe in free will . We have no choice.- Isaac B.Singer
""".trimIndent(),
                """
        I'd give my right arm to be ambidextrous.
""".trimIndent(),
                """
        Monotheism is a gift from the gods.
""".trimIndent(),
                """
        After they got rid of capital punishment, they had to hang twice
        as many people as before .
""".trimIndent(),
                """
        I never liked you, and I always will.-Samuel Goldwyn
""".trimIndent(),
                """
        Why don 't you pair `em up in threes? -Yogi Berra
""".trimIndent(),
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
                """
        The first condition of immortality is death. -Stanislaw Lec
""".trimIndent(),
                """
        As famous as the unknown soldier .
""".trimIndent(),
                """
        I must follow the people.Am I not their leader?-Benjamin Disraeli
""".trimIndent(),
                """
        Hegel was right when he said that we learn from history that man
                can never learn anything from history . - George Bernard Shaw
""".trimIndent(),
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
                """
        Everyone writes on the walls except me.- Said to be graffiti seen in Pompeii
""".trimIndent(),
                """
        I tripped over a hole that was sticking up out of the ground.
""".trimIndent(),
                """
        I don 't think anyone should write their autobiography until after
        they're dead. -Samuel Goldwyn
""".trimIndent(),
                """
        This page intentionally left blank.
""".trimIndent(),
                """
        Evil isn 't all bad.
""".trimIndent(),
                """
        I disagree with unanimity .
""".trimIndent(),
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
                """
        All truths are true to an extend, including this one.-XA
""".trimIndent(),
                """
        Assume a virtue, if you have it not.-William Shakespeare
""".trimIndent(),
                """
        All generalisations are dangerous, including this one.
""".trimIndent(),
        )
        val randomIndex = Random.nextInt(paradoxum.size)

        return paradoxum[randomIndex]
    }
}