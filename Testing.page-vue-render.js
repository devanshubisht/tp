
    var pageVueRenderFn = function anonymous(
) {
with(this){return _c('div',{attrs:{"id":"app"}},[_m(0),_v(" "),_c('div',{pre:true,attrs:{"class":"page-nav-print d-none d-print-block"}}),_v(" "),_m(1),_v(" "),_c('p',[_v("There are two ways to run tests.")]),_v(" "),_m(2),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Link")]),_v(": Read "),_c('a',{attrs:{"href":"https://se-education.org/guides/tutorials/gradle.html"}},[_v("this Gradle Tutorial from the se-edu/guides")]),_v(" to learn more about using Gradle.")])]),_v(" "),_c('hr'),_v(" "),_m(3),_v(" "),_c('p',[_v("This project has three types of tests:")]),_v(" "),_m(4)],1)}
};
    var pageVueStaticRenderFns = [function anonymous(
) {
with(this){return _c('h1',{attrs:{"id":"testing-guide"}},[_v("Testing guide"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#testing-guide","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"running-tests"}},[_v("Running tests"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#running-tests","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("Method 1: Using IntelliJ JUnit test runner")]),_v(" "),_c('ul',[_c('li',[_v("To run all tests, right-click on the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("src/test/java")]),_v(" folder and choose "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Run 'All Tests'")])]),_v(" "),_c('li',[_v("To run a subset of tests, you can right-click on a test package,\ntest class, or a test and choose "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Run 'ABC'")])])])]),_v(" "),_c('li',[_c('strong',[_v("Method 2: Using Gradle")]),_v(" "),_c('ul',[_c('li',[_v("Open a console and run the command "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("gradlew clean test")]),_v(" (Mac/Linux: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("./gradlew clean test")]),_v(")")])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"types-of-tests"}},[_v("Types of tests"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#types-of-tests","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('em',[_v("Unit tests")]),_v(" targeting the lowest level methods/classes."),_c('br'),_v("\ne.g. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("seedu.address.commons.StringUtilTest")])]),_v(" "),_c('li',[_c('em',[_v("Integration tests")]),_v(" that are checking the integration of multiple code units (those code units are assumed to be working)."),_c('br'),_v("\ne.g. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("seedu.address.storage.StorageManagerTest")])]),_v(" "),_c('li',[_v("Hybrids of unit and integration tests. These test are checking multiple code units as well as how the are connected together."),_c('br'),_v("\ne.g. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("seedu.address.logic.LogicManagerTest")])])])}
}];
  