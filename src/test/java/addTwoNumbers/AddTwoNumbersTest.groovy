package addTwoNumbers

import spock.lang.Specification

/**
 * Created by arkadiusz on 22.07.17.
 */
class AddTwoNumbersTest extends Specification {

    def "AddTwoNumbers"() {
        when:
        ListNode res = new AddTwoNumbers().addTwoNumbers(l1, l2)

        then:
        res == expectedRes

        where:
        l1           | l2          || expectedRes
        createList(5,3,1,1,7,0,7,4,6) | createList(8,4,9,3,1,8,7,8,9,1) | createList(3,8,0,5,8,8,4,3,6,2)
    }

    ListNode createList(int first, int ... rest) {
        ListNode start = new ListNode(first)
        ListNode it = start
        rest.each { num ->
            it.next = new ListNode(num)
            it = it.next
        }
        return start
    }
}
