import com.github.tantalor93.Solution557
import com.github.tantalor93.SolutionSpecification
import spock.lang.Shared
import spock.lang.Unroll

class Solution557Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution557()

    @Unroll
    def "should reverse #words"(def words, def expected) {
        expect:
        instance.reverseWords(words) == expected

        where:
        words                      | expected
        'ahoj petre'               | 'joha ertep'
        'ahoj   petre'             | 'joha   ertep'
        'ahoj   petre tady   tata' | 'joha   ertep ydat   atat'
        'ahoj'                     | 'joha'
        null                       | null

    }
}