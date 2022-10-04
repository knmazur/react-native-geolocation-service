// @flow
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
    getCurrentPosition: (options: Object, success: (data: Object) => void, error: (data: Object) => void) => void;
    startObserving: (options: Object) => void;
    stopObserving: () => void;
    addListener: (eventName: string) => void;
    removeListeners: (count: number) => void;
}

export default (TurboModuleRegistry.get<Spec>(
'RNFusedLocation'
): ?Spec);