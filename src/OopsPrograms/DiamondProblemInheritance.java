//package OopsPrograms;
//
//// Throws Error which is expected due to Diamond problem
//public class DiamondProblemInheritance {
//    interface I {
//        void foo();
//    }
//    class A implements I {
//        public void foo() {}
//    }
//
//    class B implements I {
//        public void foo() {}
//    }
//
//    class C extends A, B { // won't compile
//        public void bar() {
//            super.foo();
//        }
//    }
//}
