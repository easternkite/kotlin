/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.diagnostics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/nativeTests")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirPsiOldFrontendNativeDiagnosticsTestGenerated extends AbstractFirPsiNativeDiagnosticsTest {
    @Test
    public void testAllFilesPresentInNativeTests() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
    }

    @Test
    @TestMetadata("arrays_after.kt")
    public void testArrays_after() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/arrays_after.kt");
    }

    @Test
    @TestMetadata("cloneableInNative.kt")
    public void testCloneableInNative() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/cloneableInNative.kt");
    }

    @Test
    @TestMetadata("forwardDeclarations.kt")
    public void testForwardDeclarations() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/forwardDeclarations.kt");
    }

    @Test
    @TestMetadata("identifiers.kt")
    public void testIdentifiers() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/identifiers.kt");
    }

    @Test
    @TestMetadata("isInitialized.kt")
    public void testIsInitialized() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/isInitialized.kt");
    }

    @Test
    @TestMetadata("isInitializedError.kt")
    public void testIsInitializedError() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/isInitializedError.kt");
    }

    @Test
    @TestMetadata("nativeProtectedFunCall.kt")
    public void testNativeProtectedFunCall() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/nativeProtectedFunCall.kt");
    }

    @Test
    @TestMetadata("noObjcOverrideConflictingOverloadsDisabled.kt")
    public void testNoObjcOverrideConflictingOverloadsDisabled() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsDisabled.kt");
    }

    @Test
    @TestMetadata("noObjcOverrideConflictingOverloadsEnabled.kt")
    public void testNoObjcOverrideConflictingOverloadsEnabled() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsEnabled.kt");
    }

    @Test
    @TestMetadata("objCName.kt")
    public void testObjCName() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName.kt");
    }

    @Test
    @TestMetadata("objCName2.kt")
    public void testObjCName2() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName2.kt");
    }

    @Test
    @TestMetadata("objCName3.kt")
    public void testObjCName3() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName3.kt");
    }

    @Test
    @TestMetadata("objCName4.kt")
    public void testObjCName4() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName4.kt");
    }

    @Test
    @TestMetadata("objCName5.kt")
    public void testObjCName5() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCName5.kt");
    }

    @Test
    @TestMetadata("objCRefinement.kt")
    public void testObjCRefinement() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objCRefinement.kt");
    }

    @Test
    @TestMetadata("objcOverrideApplicability.kt")
    public void testObjcOverrideApplicability() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/objcOverrideApplicability.kt");
    }

    @Test
    @TestMetadata("resolveToDelegatedProperty.kt")
    public void testResolveToDelegatedProperty() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/resolveToDelegatedProperty.kt");
    }

    @Test
    @TestMetadata("sharedImmutable.kt")
    public void testSharedImmutable() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/sharedImmutable.kt");
    }

    @Test
    @TestMetadata("stdClassAndTypealiasAmbiguity.kt")
    public void testStdClassAndTypealiasAmbiguity() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/stdClassAndTypealiasAmbiguity.kt");
    }

    @Test
    @TestMetadata("threadLocal.kt")
    public void testThreadLocal() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/threadLocal.kt");
    }

    @Test
    @TestMetadata("throws.kt")
    public void testThrows() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/throws.kt");
    }

    @Test
    @TestMetadata("throwsClash.kt")
    public void testThrowsClash() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/throwsClash.kt");
    }

    @Test
    @TestMetadata("topLevelSingleton.kt")
    public void testTopLevelSingleton() throws Exception {
        runTest("compiler/testData/diagnostics/nativeTests/topLevelSingleton.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class SpecialBackendChecks {
        @Test
        public void testAllFilesPresentInSpecialBackendChecks() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class CInterop {
            @Test
            public void testAllFilesPresentInCInterop() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t1.kt")
            public void testT1() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t1.kt");
            }

            @Test
            @TestMetadata("t10.kt")
            public void testT10() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t10.kt");
            }

            @Test
            @TestMetadata("t11.kt")
            public void testT11() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t11.kt");
            }

            @Test
            @TestMetadata("t12.kt")
            public void testT12() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t12.kt");
            }

            @Test
            @TestMetadata("t13.kt")
            public void testT13() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t13.kt");
            }

            @Test
            @TestMetadata("t14.kt")
            public void testT14() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t14.kt");
            }

            @Test
            @TestMetadata("t37.kt")
            public void testT37() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t37.kt");
            }

            @Test
            @TestMetadata("t38.kt")
            public void testT38() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t38.kt");
            }

            @Test
            @TestMetadata("t40.kt")
            public void testT40() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t40.kt");
            }

            @Test
            @TestMetadata("t41.kt")
            public void testT41() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t41.kt");
            }

            @Test
            @TestMetadata("t42.kt")
            public void testT42() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t42.kt");
            }

            @Test
            @TestMetadata("t43.kt")
            public void testT43() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t43.kt");
            }

            @Test
            @TestMetadata("t44.kt")
            public void testT44() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t44.kt");
            }

            @Test
            @TestMetadata("t45.kt")
            public void testT45() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t45.kt");
            }

            @Test
            @TestMetadata("t46.kt")
            public void testT46() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t46.kt");
            }

            @Test
            @TestMetadata("t47.kt")
            public void testT47() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t47.kt");
            }

            @Test
            @TestMetadata("t60.kt")
            public void testT60() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t60.kt");
            }

            @Test
            @TestMetadata("t63.kt")
            public void testT63() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t63.kt");
            }

            @Test
            @TestMetadata("t64.kt")
            public void testT64() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t64.kt");
            }

            @Test
            @TestMetadata("t8.kt")
            public void testT8() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t8.kt");
            }

            @Test
            @TestMetadata("t9.kt")
            public void testT9() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t9.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class Concurrent {
            @Test
            public void testAllFilesPresentInConcurrent() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t48.kt")
            public void testT48() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t48.kt");
            }

            @Test
            @TestMetadata("t49.kt")
            public void testT49() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t49.kt");
            }

            @Test
            @TestMetadata("t50.kt")
            public void testT50() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t50.kt");
            }

            @Test
            @TestMetadata("t51.kt")
            public void testT51() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t51.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class ImmutableBlobOf {
            @Test
            public void testAllFilesPresentInImmutableBlobOf() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t54.kt")
            public void testT54() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t54.kt");
            }

            @Test
            @TestMetadata("t55.kt")
            public void testT55() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t55.kt");
            }

            @Test
            @TestMetadata("t56.kt")
            public void testT56() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t56.kt");
            }

            @Test
            @TestMetadata("t57.kt")
            public void testT57() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t57.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class NativeRef {
            @Test
            public void testAllFilesPresentInNativeRef() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t52.kt")
            public void testT52() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef/t52.kt");
            }

            @Test
            @TestMetadata("t53.kt")
            public void testT53() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef/t53.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class ObjCInterop {
            @Test
            public void testAllFilesPresentInObjCInterop() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t15.kt")
            public void testT15() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t15.kt");
            }

            @Test
            @TestMetadata("t16.kt")
            public void testT16() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t16.kt");
            }

            @Test
            @TestMetadata("t17.kt")
            public void testT17() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t17.kt");
            }

            @Test
            @TestMetadata("t18.kt")
            public void testT18() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t18.kt");
            }

            @Test
            @TestMetadata("t2.kt")
            public void testT2() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t2.kt");
            }

            @Test
            @TestMetadata("t20.kt")
            public void testT20() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t20.kt");
            }

            @Test
            @TestMetadata("t21.kt")
            public void testT21() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t21.kt");
            }

            @Test
            @TestMetadata("t22.kt")
            public void testT22() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t22.kt");
            }

            @Test
            @TestMetadata("t23.kt")
            public void testT23() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t23.kt");
            }

            @Test
            @TestMetadata("t24.kt")
            public void testT24() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t24.kt");
            }

            @Test
            @TestMetadata("t25.kt")
            public void testT25() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t25.kt");
            }

            @Test
            @TestMetadata("t26.kt")
            public void testT26() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t26.kt");
            }

            @Test
            @TestMetadata("t27.kt")
            public void testT27() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t27.kt");
            }

            @Test
            @TestMetadata("t28.kt")
            public void testT28() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t28.kt");
            }

            @Test
            @TestMetadata("t29.kt")
            public void testT29() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t29.kt");
            }

            @Test
            @TestMetadata("t30.kt")
            public void testT30() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t30.kt");
            }

            @Test
            @TestMetadata("t31.kt")
            public void testT31() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t31.kt");
            }

            @Test
            @TestMetadata("t32.kt")
            public void testT32() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t32.kt");
            }

            @Test
            @TestMetadata("t33.kt")
            public void testT33() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t33.kt");
            }

            @Test
            @TestMetadata("t34.kt")
            public void testT34() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t34.kt");
            }

            @Test
            @TestMetadata("t35.kt")
            public void testT35() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t35.kt");
            }

            @Test
            @TestMetadata("t4.kt")
            public void testT4() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t4.kt");
            }

            @Test
            @TestMetadata("t5.kt")
            public void testT5() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t5.kt");
            }

            @Test
            @TestMetadata("t6.kt")
            public void testT6() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t6.kt");
            }

            @Test
            @TestMetadata("t61.kt")
            public void testT61() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t61.kt");
            }

            @Test
            @TestMetadata("t62.kt")
            public void testT62() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t62.kt");
            }

            @Test
            @TestMetadata("t7.kt")
            public void testT7() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t7.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class Posix {
            @Test
            public void testAllFilesPresentInPosix() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t3.kt")
            public void testT3() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix/t3.kt");
            }

            @Test
            @TestMetadata("t36.kt")
            public void testT36() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix/t36.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class Reflect {
            @Test
            public void testAllFilesPresentInReflect() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
            }

            @Test
            @TestMetadata("t58.kt")
            public void testT58() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect/t58.kt");
            }

            @Test
            @TestMetadata("t59.kt")
            public void testT59() throws Exception {
                runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect/t59.kt");
            }
        }
    }
}
