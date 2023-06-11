package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    @Provides
    fun provideComputerTower(
        memory: Memory,
        processor: Processor,
        storage: Storage
    ): ComputerTower {
        return ComputerTower(memory, processor, storage)
    }

    @Provides
    fun provideMoue(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

}